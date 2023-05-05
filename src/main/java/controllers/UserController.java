package controllers;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import services.UserService;

import javax.validation.Valid;
import java.security.PublicKey;
import java.util.Map;

@Controller
@ControllerAdvice
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private MailSender mailSender;
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String add(Model model, @ModelAttribute(value = "user") @Valid User user, BindingResult result) {
        String errMsg = "";
        user.setUserId("SV" + user.getId());
        user.setRole(User.ROLE_SV);
        if (!user.getPassword().equals(user.getConfirm())) {
            errMsg ="Nhap lai mat khau sai!";
            result.addError(new ObjectError("confirm", "Nhap lai mat khau khong dung"));
        }
        if (!result.hasErrors()) {
            userService.add(user);
            return "redirect:/login";
        }
        else {
            model.addAttribute("errMsg", errMsg);
            return "register";
        }
    }

    @GetMapping("/update")
    public String update(Model model, @RequestParam int id) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "update";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addUser(Model model, @ModelAttribute(value="user") @Valid User user, BindingResult result) {
        String errMsg ="";
        if(!result.hasErrors()){
            user.setRole(User.ROLE_SV);
            userService.add(user);
            sendMail("doanquanlykhoaluan@gmail.com", user.getEmail(), "Dang ky tai khoan", "Ban da dang ky de nop khoa luan thanh cong"
                    + " voi ten dang nhap la: " + user.getUsername());
            return "redirect:/";
        }
        else {
            errMsg = "Đã có lỗi xảy ra không thêm được người dùng!";
            return "register";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser(Model model, @ModelAttribute(value="user") @Valid User user, BindingResult result) {
        String errMsg ="";
        if(!result.hasErrors()){
            userService.update(user);
            return "redirect:/";
        }
        else
            errMsg = "Đã có lỗi xảy ra không thể cập nhật thông tin người dùng!";
        model.addAttribute("errMsg", errMsg);
        return "redirect:/";
    }

    @RequestMapping("/delete")
    public String deleteCustomerForm(@RequestParam int id) {
        userService.delete(id);
        return "redirect:/";
    }

    public void sendMail(String from, String to, String subject, String content){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(content);

        mailSender.send(mailMessage);
    }
}
