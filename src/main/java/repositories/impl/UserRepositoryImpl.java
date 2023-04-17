package repositories.impl;

import dto.UserDto;
import entity.User;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import mappers.UserMapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import repositories.UserRepository;

import javax.persistence.Query;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
@Repository
@EnableWebMvc
@Transactional
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Autowired
    DataSource dataSource;

    @Override
    public List<User> getAllUser(){
        Session s = Objects.requireNonNull(this.sessionFactory.getObject()).getCurrentSession();
        Query q = s.createQuery("From User");
        List<User> result = q.getResultList();

        return result;
    }
}
