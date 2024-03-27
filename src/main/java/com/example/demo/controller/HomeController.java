package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
 
    @GetMapping("/")
    public String api()
    {
        return "home";
    }
    @GetMapping("/login.html")
    public String log() {
        return "login";
    }
    @GetMapping("/register.html")
    public String register() {
        return "register";
    }
    @GetMapping("/product")
    public String product() {
        return "product";
    }
    @GetMapping("/supplier")
    public String supplier() {
        return "supplier";
    }
    @GetMapping("/bill")
    public String bill() {
        return "bill";
    }   
}