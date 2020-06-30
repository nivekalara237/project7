package com.oc.UserService.controller;

import com.oc.UserService.dao.UserDao;
import com.oc.UserService.model.User;
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
