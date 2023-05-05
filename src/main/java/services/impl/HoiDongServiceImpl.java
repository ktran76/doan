package services.impl;

import entity.Hoidong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.HoiDongRepository;
import services.HoiDongService;

import java.util.List;

@Service
public class HoiDongServiceImpl implements HoiDongService {
    @Autowired
    HoiDongRepository hoiDongRepository;

    @Override
    public void add(Hoidong hoidong) {
        hoiDongRepository.add(hoidong);
    }

    @Override
    public void update(Hoidong hoidong) {
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
