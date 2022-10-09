package com.example.userservice_221009.controller;

import com.example.userservice_221009.database.UserDto;
import com.example.userservice_221009.model.RequestUser;
import com.example.userservice_221009.model.ResponseUser;
import com.example.userservice_221009.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {
//yml 파일에 등록된 설정 사용
    private Environment env;
    private UserService userService;

    @Autowired
    public UserController(Environment env, UserService userService) {
        this.env = env;
        this.userService = userService;
    }

    @GetMapping("/health_check")
    public String status(){
        return "it's working in user service";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return env.getProperty("greeting.message");
    }
    /*@PostMapping("/users")
    public String createUser(@RequestBody RequestUser user){
        return "create user method is called";
    }*/
   /* @PostMapping("/users")
    public String createUser(@RequestBody RequestUser user){
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDto userDto = mapper.ma

        p(user, UserDto.class);
        userService.createUser(userDto);
        return "create user method is called";

    }*/
    @PostMapping("/regist")
    public ResponseEntity<?> saveUser(@RequestBody UserDto user) throws Exception{
        return ResponseEntity.ok(userService.userSave(user));
    }

}
