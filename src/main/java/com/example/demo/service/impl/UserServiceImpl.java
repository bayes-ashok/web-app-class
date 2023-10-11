package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.userPojo.UserPojo;
import com.example.demo.userRepository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void SaveUser(UserPojo userPojo) {
        User user=new User();
        if(userPojo.getId()!=null){
            user=userRepository.findById(userPojo.getId())
                    .orElseThrow(() -> new UserNotFoundException("User not found"));

        }
        System.out.println(userPojo);
        user.setId(userPojo.getId());
        user.setUsername(userPojo.getUsername());
        user.setPassword(userPojo.getPassword());
        user.setFullName(userPojo.getFull_name());
        userRepository.save(user);

    }


    public List<User> getAllData() {
        return userRepository.findAll();
    }
}
