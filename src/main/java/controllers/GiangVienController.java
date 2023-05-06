package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ControllerAdvice
public class GiangVienController {
    @GetMapping("/giangvien/submit")
    public String submit() {
        return "giangvien-chamdiem";
    }

    @GetMapping("/giangvien/thongtin")
    public String inf() {
        return "giangvien-inf";
    }

    @GetMapping("/giangvien/hoidong")
    public String khoaluan() {
        return "hoidong";
    }

    @GetMapping("/giangvien/chamdiem")
    public String chamdiem() {
        return "chamdiem";
    }
}
