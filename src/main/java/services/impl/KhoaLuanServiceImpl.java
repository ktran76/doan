package services.impl;

import dto.KhoaLuanResponseDTO;
import entity.Khoaluan;
import entity.Khoaluandetail;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.KhoaLuanRepository;
import services.KhoaLuanService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Service
public class KhoaLuanServiceImpl implements KhoaLuanService {

    @Autowired
    KhoaLuanRepository khoaLuanRepository;

    @Override
    public List<KhoaLuanResponseDTO> getKhoaLuandetail(String khoaLuanId) {
        List<Object> o = khoaLuanRepository.getKhoaLuandetail(khoaLuanId);
        List<KhoaLuanResponseDTO> list = new ArrayList<>();
        for (Iterator<Object> it = o.iterator(); it.hasNext();) {
            Object[] object = (Object[]) it.next();
            KhoaLuanResponseDTO khoaLuanResponseDTO = new KhoaLuanResponseDTO();
            khoaLuanResponseDTO.setKhoaLuanId((String) object[0]);
            khoaLuanResponseDTO.setTenKhoaLuan((String) object[1]);
            khoaLuanResponseDTO.setUserId((String) object[2]);
            khoaLuanResponseDTO.setFullname((String) object[3]);
            list.add(khoaLuanResponseDTO);
        }
        return list;
    }

    @Override
    public void add(Khoaluan khoaluan) {
        khoaLuanRepository.add(khoaluan);
    }

    @Override
    public void update(Khoaluan khoaluan) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void addDetail(Khoaluan khoaluan, List<User> users) {
        for (User user: users) {
            Khoaluandetail khoaluandetail = new Khoaluandetail();
            khoaluandetail.setUser(user);
            khoaluandetail.setKhoaluan(khoaluan);
            khoaLuanRepository.addDetail(khoaluandetail);
        }

    }

    @Override
    public void updateDetail() {

    }

    @Override
    public void deleteDetail() {

    }
}
