package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository repo;
    public User createUser(User user){
        return repo.save(user);
    }
    public List<User>getUsers(){
        return repo.findAll();
    }
    public User getUserById(int userid){
        return repo.findById(userid).orElse(null);
    }
    public User updateUser(User user, int userid){
        User olduser=repo.findById(userid).orElse(null);
        olduser.setName(user.getName());
        olduser.setTTL(user.getTTL());
        olduser.setTimestamp(user.getTimestamp());
        repo.save(olduser);
        return olduser;




    }
    public void deleteUser(int userid){
        repo.deleteById(userid);
    }
}
