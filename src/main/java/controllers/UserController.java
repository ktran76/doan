package controllers;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import services.UserService;

import javax.validation.Valid;
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

    @RequestMapping("/register")
    public String register(Map<String, Object> model) {
        User user = new User();
        model.put("user", user);
        return "register";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addUser(Model model, @ModelAttribute(value="user") @Valid User user, BindingResult result) {
        String errMsg ="";
        if(!result.hasErrors()){
            userService.add(user);
            sendMail("doanquanlykhoaluan@gmail.com", user.getEmail(), "Dang ky tai khoan", "Ban da dang ky de nop khoa luan thanh cong"
                    + " voi ten dang nhap la: " + user.getUsername());
            return "redirect:/";
        }
        else
            errMsg = "Đã có lỗi xảy ra không thêm được người dùng!";
        model.addAttribute("errMsg", errMsg);
        return "redirect:/login";
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
        return "redirect:/login";
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
