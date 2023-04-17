package repositories;

import dto.UserDto;
import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.SQLException;
import java.util.List;

public interface UserRepository{
    List<User> getAllUser();
}