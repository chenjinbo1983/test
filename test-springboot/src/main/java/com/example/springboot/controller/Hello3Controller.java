package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello3Controller {
    @RequestMapping("/hello3")
    public String hello() {
        System.out.println("hello1123");
        return "hello,world!";
    }
}
