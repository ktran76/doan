package services;

import dto.UserDto;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface UserService {
    List<UserDto> getAllUser();
}
