package com.example.userservice.controller;

import com.example.userservice.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    @GetMapping("/{userId}")
    public User info(@PathVariable Long userId){
        log.info("users/ping接口访问");
        User user = new User();
        user.setUserName("wanglibo");
        user.setPhone("15011171462");
        user.setEmail("yu47251@126.com");
        return user;
    }
}
