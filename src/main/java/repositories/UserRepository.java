package repositories;


import entity.User;

import java.util.List;

public interface UserRepository {
    List<User> listAll();
    void add(User user);
    void delete(int id);
    User findById(int id);
    User getUserByUserName(String name);
    void update(User user);
}