package com.example.demo.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.Login;
import com.example.demo.service.RegService;

@Controller
public class RegController {
 
    @Autowired
    private RegService service;
 
    @PostMapping("/reg")
    public String register(@ModelAttribute("user") Login user) {
        service.reg(user.getUsername(), user.getPassword());
        return "redirect:/display";
    }
}