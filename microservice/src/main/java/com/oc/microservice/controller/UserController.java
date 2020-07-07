package com.oc.microservice.controller;

import com.oc.microservice.dao.UserDao;
import com.oc.microservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @GetMapping(value = "User/{username}")
    public User findByUsername(@PathVariable String username){
        return userDao.findUserByUsername(username);
    }
}
