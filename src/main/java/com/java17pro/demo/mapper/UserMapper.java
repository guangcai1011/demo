package com.java17pro.demo.mapper;

import com.java17pro.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> queryUserList();

}
