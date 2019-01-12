package com.example.userservice.service.impl;

import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Value("${name}")
    private String userName;

    @Value("${phone}")
    private String phone;

    @Value("${email}")
    private String email;

    @Override
    public User getInfo(){
        User user = new User();
        user.setUserName(userName);
        user.setPhone(phone);
        user.setEmail(email);
        return user;
    }
}
