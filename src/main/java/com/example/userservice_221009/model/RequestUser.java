package com.example.userservice_221009.model;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*회원가입시 front에서 요청 받는 json 객체
* */
//@Data
public class RequestUser {

    @NotNull(message="email cannot be null")
    @Size(min=2, message = "email not be less than two characters")
    @Email
    private String email;

    @NotNull(message = "password cannot be null")
    @Size(min=8, message = "password must be equal or grater than 8 characters and less than 6 characters")
    private String pwd;

    @NotNull(message = "name cannot be null")
    @Size(min=2, message = "name not be less than two characters")
    private String name;
    
}
