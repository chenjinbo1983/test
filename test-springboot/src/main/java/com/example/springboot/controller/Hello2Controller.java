package com.example.springboot.controller;

import com.example.springboot.mapper.CbhTransactLogMapper;
import com.example.springboot.mapper.TestMapper;
import com.example.springboot.model.CbhTransactLog;
import com.example.springboot.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class Hello2Controller {

    @Autowired
    TestMapper testMapper;

    @Autowired
    CbhTransactLogMapper cbhTransactLogMapper;

    @RequestMapping("/hello2")
    public String hello(Model model) {
        model.addAttribute("now", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        System.out.println("hello222");
        List<Test> tests = testMapper.findAll();
        model.addAttribute("tests",tests);
        List<CbhTransactLog> logs = cbhTransactLogMapper.findAll();
        model.addAttribute("logs",logs);

        return "hello";
    }
}
