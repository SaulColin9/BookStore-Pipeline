package com.bookstore.BookStoreApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class InitialController {
    @GetMapping("/greeting")
    public String greetUser(){
        return "Hello, welcome!";
    }

}
