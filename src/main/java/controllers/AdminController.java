package controllers;


import entity.Hoidong;
import entity.Khoaluan;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.HoiDongService;
import services.KhoaLuanService;
import services.UserService;

import javax.validation.Valid;
import java.util.List;


@Controller
public class AdminController {
    @Autowired
    UserService userService;
    @Autowired
    KhoaLuanService khoaLuanService;
    @Autowired
    HoiDongService hoiDongService;

    @RequestMapping("/admin/deleteUser")
    public String deleteUser(@RequestParam int id) {
        userService.delete(id);
        return "redirect:/admin";
    }

    @RequestMapping("/admin/deleteKhoaLuan")
    public String deleteKhoaLuan(@RequestParam int id) {
        khoaLuanService.delete(id);
        return "redirect:/admin";
    }

    @RequestMapping("/admin/hoidong")
    public String retrivehoidong(Model model) {
        hoiDongService.retrive();

        return "redirect:/admin";
    }

    @RequestMapping("/admin/addHoiDong")
    public String addHoiDong(Model model, @ModelAttribute(value = "hoidong") @Valid Hoidong hoidong, List<Khoaluan> khoaluans, List<User> users) {
        List<User> dropList = userService.listAll();
        model.addAttribute("dropList", dropList);
        hoiDongService.add(hoidong, khoaluans, users);
        return "redirect:/admin";
    }

    @RequestMapping("/admin/updateHoiDong")
    public String updateHoiDong(@ModelAttribute(value = "hoidong") @Valid Hoidong hoidong, List<Khoaluan> khoaluans, List<User> users) {
        hoiDongService.update(hoidong, khoaluans, users);
        return "redirect:/admin";
    }

    @RequestMapping("/admin/deleteHoiDong")
    public String deleteHoiDong(@ModelAttribute(value = "hoidong") @Valid Hoidong hoidong) {
        hoiDongService.delete(hoidong.getId());
        return "redirect:/admin";
    }
}
