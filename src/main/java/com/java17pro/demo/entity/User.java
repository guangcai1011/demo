package com.java17pro.demo.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Id;
import javax.persistence.Table;



@Table(name = "user")
public class User {
    @Id
    private int id;
    private int userId;
    private String userName;
    private int age;
    private String address;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
