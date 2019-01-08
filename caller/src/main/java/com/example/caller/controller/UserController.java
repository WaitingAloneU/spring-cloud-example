package com.example.caller.controller;

import com.example.caller.entity.User;
import com.example.caller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("users")
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("1234")
    public User getUser(){
        return userService.getUser(1234L);
    }
}
