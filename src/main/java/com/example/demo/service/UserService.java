package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.userPojo.UserPojo;

import java.util.List;

public interface UserService {
    void SaveUser(UserPojo userpojo);
    List<User> getAllData();

}
