package com.example.jpa.user.controller;

import com.example.jpa.user.db.UserEntity;
import com.example.jpa.user.db.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserApiController {

    private final UserRepository userRespository;

    @GetMapping("/find-all")
    public List<UserEntity> findAll() {
        return userRespository.findAll();
    }

    @GetMapping("/name")
    public void autoSave(@RequestParam String name){
        var user = UserEntity.builder()
                .name(name)
                .build();

        userRespository.save(user);
    }
}
