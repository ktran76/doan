package services;

import entity.Hoidong;
import entity.Khoaluan;
import entity.User;

import java.util.List;

public interface HoiDongService {
    void add(Hoidong hoidong, List<Khoaluan> khoaluans, List<User> users);
    void update(Hoidong hoidong, List<Khoaluan> khoaluans, List<User> users);
    void delete(int id);
    Hoidong findById(int id);
    List<Hoidong> retrive();
}
