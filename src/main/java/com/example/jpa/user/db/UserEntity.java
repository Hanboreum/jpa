package com.example.jpa.user.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//db와 매핑 할 것. = ORM
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name ="user") //user테이블과 매핑할 것
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //mysql - db에 의해 Ai
    private Long id; //PK
    private String name;
    private Integer age;
    private String email;
}
