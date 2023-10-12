package com.example.demo.usercontroller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.userPojo.UserPojo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("user")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/save")
    public String saveUser(@Valid @RequestBody UserPojo userPojo){
        userService.SaveUser(userPojo);
        return "data created";
    }

    @GetMapping("/getAll")
    public List<User> getAllData(){
        return userService.getAllData();
    }

    @GetMapping("/getById/{id}")
    public Optional<User> getDataBtId(@PathVariable("id") Integer id){
        return userService.getById(id);
    }


}
