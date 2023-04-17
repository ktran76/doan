package services.impl;


import dto.UserDto;
import entity.User;
import mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;
import repositories.UserRepository;
import services.UserService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public List<User> getAllUser(){
        return userRepository.getAllUser();
    }
}
