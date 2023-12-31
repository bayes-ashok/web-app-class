package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.Pojo.UserPojo;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void SaveUser(UserPojo userpojo);
    List<User> getAllData();
    Optional<User> getById(Integer id);

    void deleteById(Integer id);
}
