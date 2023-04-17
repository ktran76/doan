package controllers;

import dto.UserDto;
import entity.User;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.UserService;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;


@Slf4j
@Controller
public class HomeController {
    @Autowired
    UserService userService;



    @RequestMapping("/")
    public String hello(@RequestParam(required = false) String username, Model model){
        List<User> users = userService.getAllUser();
        for (User user: users) {
            System.out.println(user.getUsername());
        }
        return "index";
    }
}
