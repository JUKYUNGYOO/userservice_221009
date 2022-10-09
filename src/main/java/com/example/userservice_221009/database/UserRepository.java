package com.example.userservice_221009.database;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
* UserRepository 클래스는 MyBatis를 사용할 때 주로 쓰이는
* DAO, Mapper의 개념과 동일하다고 보면됨.
* JpaRepository를 상속받았으며, 위에서 생성한 UserEntity를 사용.
*
* */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
