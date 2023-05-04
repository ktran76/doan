package services;


import entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService extends UserDetailsService {
    List<User> listAll();
    void add(User user);
    User findById(int id);
    void delete(int id);
    User getUserByUserName(String name);
    void update(User user);
}
