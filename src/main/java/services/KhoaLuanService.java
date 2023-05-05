package services;

import dto.KhoaLuanResponseDTO;
import entity.Khoaluan;
import entity.User;

import java.util.List;
import java.util.Objects;

public interface KhoaLuanService {
    List<KhoaLuanResponseDTO> getKhoaLuandetail(String KhoaLuanId);
    void add(Khoaluan khoaluan);
    void update(Khoaluan khoaluan);
    void delete(int id);
    void addDetail(Khoaluan khoaluan, List<User> users);
    void updateDetail();
    void deleteDetail();
}
