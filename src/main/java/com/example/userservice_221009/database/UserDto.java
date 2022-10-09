package com.example.userservice_221009.database;

import lombok.Data;

import java.util.Date;

/*UserDto(UserController, UserService, UserRepository)
 통신을 위한 데이터 세팅용 class
* */
//@Data
public class UserDto {
   private String username;
   private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
