package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Login;
import com.example.demo.repository.LogRepo;
@Service
public class RegService {
    @Autowired
    private LogRepo rep;

    public void reg(String username, String password){
        Login user = new Login();
        user.setUsername(username);
        user.setPassword(password);
        rep.save(user);
    }
}
