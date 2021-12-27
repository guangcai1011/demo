package com.java17pro.demo.service;

import com.java17pro.demo.entity.User;

import java.util.List;

public interface UserService {

    List<User> queryUserList();

     int deleteUserByIds();
}
