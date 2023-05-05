package controllers;

import dto.KhoaLuanResponseDTO;
import entity.Khoaluan;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import services.KhoaLuanService;
import services.UserService;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Controller
public class KhoaLuanController {
    @Autowired
    KhoaLuanService khoaLuanService;

    @Autowired
    UserService userService;
//    add Khoa Luan
    @GetMapping("/khoaluan")
    public String add(){
        Khoaluan khoaluan = new Khoaluan(3, "KL03", "Lap trinh huong doi tuong", LocalDateTime.now(), "abcd");
        List<User> users = userService.listAll();
        khoaLuanService.add(khoaluan);
        khoaLuanService.addDetail(khoaluan , users);
        return "khoaluan";
    }
//    update KhoaLuan
    public String update(){
        return "sinhvien_updatekhoaluan";
    }
//    delete KhoaLuan
    public String delete(){
        return "sinhvien_deletekhoaluan";
    }
//    retrieve all
    public String retrive(){
        return "admin/khoaluans";
    }

    @RequestMapping("/khoaluan")
    public ModelAndView getKhoaLuanDetail(@RequestParam String khoaLuanId, Model model) {
        List<KhoaLuanResponseDTO> responseDTOS = khoaLuanService.getKhoaLuandetail(khoaLuanId);
        ModelAndView mav = new ModelAndView("khoaluan");
        mav.addObject("list", responseDTOS);
        return mav;
    }
}
