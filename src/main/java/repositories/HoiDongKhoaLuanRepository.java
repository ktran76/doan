package repositories;

import entity.Hoidongkhoaluan;

public interface HoiDongKhoaLuanRepository {
    void add(Hoidongkhoaluan hdkl);
    void update(Hoidongkhoaluan hdkl);
    void delete(int id);
}
