package com.example.caller.service;


import com.example.caller.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "user-service")
public interface UserService {

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
    User getUser(@PathVariable(value = "userId") Long userId);
}
