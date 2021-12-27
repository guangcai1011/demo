package com.java17pro.demo.controller;

import com.java17pro.demo.entity.User;
import com.java17pro.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getUser")
    public List<User> getUserName(){
        List<User> userList = userService.queryUserList();
        return userList;
    }

    @RequestMapping("/deleteUserByIds")
    public String deleteUserByIds(){
        int a = userService.deleteUserByIds();

        return "delete successfully!";
    }
}
