package com.java17pro.demo.service.impl;

import com.java17pro.demo.entity.User;
import com.java17pro.demo.mapper.UserMapper;
import com.java17pro.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public int deleteUserByIds() {



//        int a = userMapper.deleteByIds("user_id_001,user_id_002");

        return 0;
    }

}
