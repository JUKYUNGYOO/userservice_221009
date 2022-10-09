package com.example.userservice_221009.service;

import com.example.userservice_221009.database.UserDto;
import com.example.userservice_221009.database.UserEntity;
import com.example.userservice_221009.database.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;
/*
* UserService의 구현체
* UserService를 다른 클래스에서 빈으로 등록해서 사용하기 위해서 @Service어노테이션 명시
* */
@Service
@Slf4j
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserEntity userSave(UserDto userDto){
        UserEntity findUser = userRepository.findByUsername(userDto.getUsername());
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userDto.getUsername());
        userEntity.setPassword(passwordEncoder.encode(userDto.getPassword()));
        return userRepository.save(userEntity);
    }


}
