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

    @RequestMapping("/")
    public ModelAndView home() {
        List<User> listUser = userService.listAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listUser", listUser);
        return mav;
    }


}
