package repositories;

import entity.Hoidonggiangvien;

public interface HoiDongGiangVienRepository {
    void add(Hoidonggiangvien hdgv);
    void update(Hoidonggiangvien hdgv);
    void delete(int id);
}
