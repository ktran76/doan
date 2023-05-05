package controllers;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {
    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }
}
