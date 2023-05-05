package controllers;

import org.springframework.stereotype.Controller;

@Controller
public class TieuChiController {
    //    add Tieu Chi
    public String add(){
        return "admin/tieuchi";
    }
    //    update Tieu chi
    public String update(){
        return "admin/tieuchi";
    }
    //    delete Tieu chi
    public String delete(){
        return "admin/tieuchi";
    }
    //    retrieve all
    public String retrive(){
        return "giangvien/tieuchis";
    }
}
