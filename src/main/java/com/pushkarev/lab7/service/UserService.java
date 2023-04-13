package com.pushkarev.lab7.service;

import com.pushkarev.lab7.dto.UserDto;
import com.pushkarev.lab7.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
