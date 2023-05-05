package controllers;

import org.springframework.stereotype.Controller;

@Controller
public class NhanXetController {
    //    add Nhan xet
    public String add(){
        return "giangvien/nhanxet";
    }
    //    update Nhan xet
    public String update(){
        return "giangvien/nhanxet";
    }
    //    delete Nhan xet
    public String delete(){
        return "giangvien/nhanxet";
    }
    //    retrieve all
    public String retrive(){
        return "admin/nhanxets";
    }
}
