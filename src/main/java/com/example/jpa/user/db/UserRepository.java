package com.example.jpa.user.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserEntity,Long>{
    //같은 인터페이스 이기 때문에 extends. Long id를 받음

    //findAll이 이미 있다.
}
