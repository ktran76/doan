package repositories;

import entity.Khoaluan;
import entity.Khoaluandetail;

import java.util.List;
import java.util.Objects;

public interface KhoaLuanRepository {
    List<Object> getKhoaLuandetail(String khoaLuanId);
    void add(Khoaluan khoaluan);
    void update(Khoaluan khoaluan);
    void delete(Khoaluan khoaluan);
    void addDetail(Khoaluandetail khoaluandetail);
    void updateDetail(Khoaluandetail khoaluandetail);
    void deleteDetail(Khoaluandetail khoaluandetail);
}
