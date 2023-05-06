package controllers;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import services.UserService;

import java.util.List;
import java.util.Map;


@Controller
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/sinhvien")
    public String sinhvien() {
        return "sinhvien";
    }

    @GetMapping("/giangvien")
    public String giangvien() {
        return "giangvien";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

}
