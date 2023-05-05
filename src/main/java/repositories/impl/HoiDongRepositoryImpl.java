package repositories.impl;

import entity.Hoidong;
import entity.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import repositories.HoiDongRepository;

import javax.persistence.Query;
import java.util.List;
import java.util.Objects;

@Transactional
@Repository
public class HoiDongRepositoryImpl implements HoiDongRepository {
    @Autowired
    LocalSessionFactoryBean factoryBean;


    @Override
    public void add(Hoidong hoidong) {
        Session s = factoryBean.getObject().getCurrentSession();
        s.save("hoidong", hoidong);
    }

    @Override
    public void update(Hoidong hoidong) {
        Session s = factoryBean.getObject().getCurrentSession();
        s.delete(findById(hoidong.getId()));
        s.save(hoidong);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Hoidong findById(int id) {
        Session session = Objects.requireNonNull(factoryBean.getObject()).getCurrentSession();
        return session.get(Hoidong.class, id);
    }

    @Override
    public List<Hoidong> retrive() {
        Session session = Objects.requireNonNull(factoryBean.getObject()).getCurrentSession();
        Query q = session.createQuery("FROM Hoidong");
        return q.getResultList();
    }
}
