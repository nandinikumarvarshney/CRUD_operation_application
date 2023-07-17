package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class Usercontroller {
    @Autowired
    UserService service;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping("/getusers")
    public List<User> getUser() {
        return service.getUsers();
    }

    @GetMapping("/getuser/{userid}")
    public User getUserByID(@PathVariable int userid) {
        return service.getUserById(userid);
    }

    @PutMapping("/{userid}")
    public User updateUsers(@PathVariable int userid, @RequestBody User user) {
        return service.updateUser(user, userid);
    }

    @DeleteMapping("/delete/{userid}")
    public ResponseEntity<String> deleteUser(@PathVariable int userid) {
        service.deleteUser(userid);
        return new ResponseEntity<String>("User Deleted", HttpStatus.OK);
    }


}
