package controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;


@Slf4j
@Controller
public class HomeController {



    @RequestMapping("/")
    public String hello() throws IOException {
        return "index";
    }
}
