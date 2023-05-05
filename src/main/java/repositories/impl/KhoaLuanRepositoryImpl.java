package repositories.impl;

import entity.Khoaluan;
import entity.Khoaluandetail;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import repositories.KhoaLuanRepository;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Transactional
@Repository
public class KhoaLuanRepositoryImpl implements KhoaLuanRepository {
    @Autowired
    LocalSessionFactoryBean factoryBean;

    @Override
    public List<Object> getKhoaLuandetail(String khoaLuanId) {
        List<Object> result = new ArrayList<>();
        Session s = factoryBean.getObject().getCurrentSession();
        Query q = s.createQuery("SELECT kl.khoaLuanId, kl.tenKhoaLuan, u.userId, u.fullname FROM Khoaluan kl" +
                                    " RIGHT OUTER JOIN Khoaluandetail kld ON kl.khoaLuanId = kld.khoaluan" +
                                    " LEFT OUTER JOIN User u ON u.userId = kld.user" +
                                    " WHERE kl.khoaLuanId LIKE '"+ khoaLuanId + "'");
        result = q.getResultList();
        return result;
    }

    @Override
    public void add(Khoaluan khoaluan) {
        Session session = factoryBean.getObject().getCurrentSession();
        session.save(khoaluan);
    }

    @Override
    public void update(Khoaluan khoaluan) {

    }

    @Override
    public void delete(Khoaluan khoaluan) {

    }

    @Override
    public void addDetail(Khoaluandetail khoaluandetail) {
        Session session = factoryBean.getObject().getCurrentSession();
        session.save(khoaluandetail);
    }

    @Override
    public void updateDetail(Khoaluandetail khoaluandetail) {

    }

    @Override
    public void deleteDetail(Khoaluandetail khoaluandetail) {

    }
}
