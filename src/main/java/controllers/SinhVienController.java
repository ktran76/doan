package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ControllerAdvice
public class SinhVienController {

    @GetMapping("/sinhvien/submit")
    public String submit() {
        return "submit-khoaluan";
    }

    @GetMapping("/sinhvien/thongtin")
    public String inf() {
        return "sinhvien-inf";
    }

    @GetMapping("/sinhvien/khoaluan")
    public String khoaluan() {
        return "khoaluan";
    }
}
