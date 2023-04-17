package services;

import dto.UserDto;
import entity.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface UserService {
    List<User> getAllUser();
}
