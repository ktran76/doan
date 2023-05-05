package services;

import entity.Hoidong;

import java.util.List;

public interface HoiDongService {
    void add(Hoidong hoidong);
    void update(Hoidong hoidong);
    void delete(int id);
    Hoidong findById(int id);
    List<Hoidong> retrive();
}
