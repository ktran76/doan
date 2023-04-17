package mappers.impl;

import dto.UserDto;
import entity.User;
import mappers.UserMapper;

public class UserMapperImpl implements UserMapper {
    @Override
    public User toEntity(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());


        return userDto;
    }

    @Override
    public User partialUpdate(UserDto userDto, User user) {
        return null;
    }
}
