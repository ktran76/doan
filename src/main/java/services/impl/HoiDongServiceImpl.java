package services.impl;

import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.HoiDongGiangVienRepository;
import repositories.HoiDongKhoaLuanRepository;
import repositories.HoiDongRepository;
import services.HoiDongService;

import java.util.ArrayList;
import java.util.List;

@Service
public class HoiDongServiceImpl implements HoiDongService {
    @Autowired
    HoiDongRepository hoiDongRepository;
    @Autowired
    HoiDongGiangVienRepository hoiDongGiangVienRepository;
    @Autowired
    HoiDongKhoaLuanRepository hoiDongKhoaLuanRepository;

    @Override
    public void add(Hoidong hoidong, List<Khoaluan> khoaluans, List<User> users) {
        List<Hoidonggiangvien> hdgvs = new ArrayList<>();
        for (User user : users) {
            Hoidonggiangvien hdgv = new Hoidonggiangvien();
            hdgv.setGiangVien(user);
            hdgv.setHoiDongGiangVien(hoidong);
            hoiDongGiangVienRepository.add(hdgv);
        }
        List<Hoidongkhoaluan> hdkls = new ArrayList<>();
        for (Khoaluan khoaluan : khoaluans) {
            Hoidongkhoaluan hdkl = new Hoidongkhoaluan();
            hdkl.setHoiDongKhoaLuan(hoidong);
            hdkl.setKhoaLuan(khoaluan);
            hoiDongKhoaLuanRepository.add(hdkl);
        }
        hoiDongRepository.add(hoidong);
    }

    @Override
    public void update(Hoidong hoidong, List<Khoaluan> khoaluans, List<User> users) {
        List<Hoidonggiangvien> hdgvs = new ArrayList<>();
        for (User user : users) {
            Hoidonggiangvien hdgv = new Hoidonggiangvien();
            hdgv.setGiangVien(user);
            hdgv.setHoiDongGiangVien(hoidong);
            hoiDongGiangVienRepository.update(hdgv);
        }
        List<Hoidongkhoaluan> hdkls = new ArrayList<>();
        for (Khoaluan khoaluan : khoaluans) {
            Hoidongkhoaluan hdkl = new Hoidongkhoaluan();
            hdkl.setHoiDongKhoaLuan(hoidong);
            hdkl.setKhoaLuan(khoaluan);
            hoiDongKhoaLuanRepository.update(hdkl);
        }
        hoiDongRepository.update(hoidong);
    }

    @Override
    public void delete(int id) {
        hoiDongRepository.delete(id);
    }

    @Override
    public Hoidong findById(int id) {
        return hoiDongRepository.findById(id);
    }

    @Override
    public List<Hoidong> retrive() {
        return hoiDongRepository.retrive();
    }
}
