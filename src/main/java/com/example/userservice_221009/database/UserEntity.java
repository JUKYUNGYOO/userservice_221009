package com.example.userservice_221009.database;

/*
* db와 연동되는 entity 객체
* */

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
/*
* UserEntity Class는 JPA를 사용할 때 사용되는 Class
* @Entity 어노테이션을 통해 해당 클래스가 Entity 클래스임을 나타내며,
* @Table(name="users") 어노테이션을 통하여 users테이블에 맵핑된 클래스임을 나타냅니다.
  application.properties파일에 spring.jpa.hibernate.ddl-auto=create-drop 옵션을 통하여 users 테이블이 자동 생성
* */


@Entity
@Table(name="user")
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String username;

    @Column
    @JsonIgnore
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
