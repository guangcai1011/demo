package com.java17pro.demo.service.impl;

import com.java17pro.demo.mapper.UserMapper;
import com.java17pro.demo.entity.User;
import com.java17pro.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userDao;

    @Override
    public List<User> queryUserList() {
        return userDao.queryUserList();
    }
}
