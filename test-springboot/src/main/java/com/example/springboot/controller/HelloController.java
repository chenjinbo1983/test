package com.example.springboot.controller;

import com.example.springboot.mapper.CbhTransactLogMapper;
import com.example.springboot.model.CbhTransactLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    CbhTransactLogMapper cbhTransactLogMapper;

    @RequestMapping("/hello")
    public List<CbhTransactLog> hello() {
        System.out.println("hello1123");
        List<CbhTransactLog> logs = cbhTransactLogMapper.findAll();
        return logs;
    }
}
