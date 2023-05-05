package repositories;



import entity.Hoidong;

import java.util.List;

public interface HoiDongRepository {
    void add(Hoidong hoidong);
    void update(Hoidong hoidong);
    void delete(int id);
    Hoidong findById(int id);
    List<Hoidong> retrive();
}
