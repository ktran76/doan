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
import java.util.Objects;

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

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser(Model model, @ModelAttribute(value="user") User user) {
        String errMsg ="";
        User update = userService.findById(user.getId());
        if (Objects.isNull(user.getConfirm())) {
            errMsg = "Nhap lai mat khau!";
            return "/update";
        }
        update.setUsername(user.getUsername());
        if (!user.getPassword().equals(update.getPassword())) {
            update.setPassword(user.getPassword());
            update.setConfirm(user.getConfirm());
        }
        else
            update.setConfirm(user.getPassword());
        update.setAvatar(user.getAvatar());
        update.setEmail(user.getEmail());
        update.setPhoneNumber(user.getPhoneNumber());
        update.setFullname(user.getFullname());

        if (update.getPassword().equals(update.getConfirm())) {
            userService.update(update);
        }
        else
            errMsg = "Nhap mat khau khong dung!";
        model.addAttribute("errMsg", errMsg);
        return "/update";
    }

    @GetMapping("/sinhvien/inf")
    public String sinhvieninf(Model model, @RequestParam int id) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "inf";
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
