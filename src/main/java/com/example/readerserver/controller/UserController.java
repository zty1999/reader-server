package com.example.readerserver.controller;

import com.example.readerserver.bean.User;
import com.example.readerserver.mapper.UserMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    private Gson gson = new Gson();

    @Autowired
    UserMapper userMapper;
    @GetMapping("/select")
    public String getUser(@RequestParam(value = "username", defaultValue = "test") String name) {
        List<User> userList = userMapper.selectList(null);
        return gson.toJson(userList);
    }

}


