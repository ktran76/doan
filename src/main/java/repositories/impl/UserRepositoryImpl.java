package repositories.impl;

import entity.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import repositories.UserRepository;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Transactional
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private LocalSessionFactoryBean factoryBean;

    @Override
    public List<User> listAll() {
        Session session = Objects.requireNonNull(factoryBean.getObject()).getCurrentSession();
        Query q = session.createQuery("FROM User");
        return q.getResultList();
    }

    @Override
    public void add(User user) {
        user.setConfirm(user.getPassword());
        Session session = Objects.requireNonNull(factoryBean.getObject()).getCurrentSession();
        user.setCreatedDate(LocalDateTime.now());
        session.save(user);
    }

    @Override
    public void delete(int id) {
        Session session = Objects.requireNonNull(factoryBean.getObject()).getCurrentSession();
        User u = this.findById(id);
        session.delete(u);
    }

    @Override
    public User findById(int id) {
        Session session = Objects.requireNonNull(factoryBean.getObject()).getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public User getUserByUserName(String name) {
        Session session = Objects.requireNonNull(factoryBean.getObject()).getCurrentSession();
        CriteriaBuilder b = session.getCriteriaBuilder();
        CriteriaQuery<User> q = b.createQuery(User.class);
        Root root = q.from(User.class);
        q.select(root);
        q.where(b.equal(root.get("username"), name));
        Query query = session.createQuery(q);
        return (User) query.getSingleResult();
    }

    @Override
    public void update(User user) {
        Session session = Objects.requireNonNull(factoryBean.getObject()).getCurrentSession();
        session.saveOrUpdate(user);
    }
}
