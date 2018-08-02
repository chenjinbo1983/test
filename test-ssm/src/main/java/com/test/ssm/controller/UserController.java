package com.test.ssm.controller;


import com.test.ssm.dao.UserDao;
import com.test.ssm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

//    @Autowired
//    UserService userService;

    @RequestMapping("/hello")
    public String hello(Model model) {
//        System.out.print("hello2");
//        model.addAttribute("now", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
//        System.out.println("hello222");
//        List<test> tests = testMapper.findAll();
//        model.addAttribute("tests",tests);
//        List<CbhTransactLog> logs = cbhTransactLogMapper.findAll();
//        model.addAttribute("logs",logs);
        UserDao userDao = this.userDao;
        List<User> users = userDao.selectAllUser();
        model.addAttribute("users", users);
//        List<User> users = userService.getAll();


        System.out.println(users.get(0).getId());
        return "hello";
    }

}
