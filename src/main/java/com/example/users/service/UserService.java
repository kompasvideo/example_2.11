package com.example.users.service;

import com.example.users.model.User;
import com.example.users.model.dto.UserDto;

public interface UserService {
    User saveUser(UserDto userDto);
    User updateUser(long userId, User updateUser);
    User getUser(long userId);
    void deleteUser(long userId);
}
