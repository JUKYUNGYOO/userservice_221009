package com.example.userservice_221009.service;

import com.example.userservice_221009.database.UserDto;
import com.example.userservice_221009.database.UserEntity;

public interface UserService {

    public UserEntity userSave(UserDto userDto);
}
