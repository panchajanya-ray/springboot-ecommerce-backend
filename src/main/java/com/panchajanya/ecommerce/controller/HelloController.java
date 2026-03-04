package com.panchajanya.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Spring Boot is running!";
    }
    
    @GetMapping("/status")
    public String status() {
        return "Backend healthy";
    }
}