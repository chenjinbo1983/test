package com.test.ssm.controller;


import com.test.ssm.dao.User2Dao;
import com.test.ssm.model.User;
import com.test.ssm.model.User2;
import com.test.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class User2Controller {

    @Autowired
    UserService userService;

    @Autowired
    User2Dao user2Dao;

    /* @RequestMapping 可以指定请求到方法上，而不指定到Controller上*/
    @RequestMapping("/user2/hello")
    public String hello(Model model) {
        List<User> users = userService.getAll();
        model.addAttribute("users", users);
//        System.out.println(users.get(0).getId());

        /*
        spring-mvc.xml，有如下配置
        <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
            <property name="prefix" value="/WEB-INF/views/" />
            <property name="suffix" value=".jsp"/>
        </bean>
         所以转向/WEB-INF/views/user.jsp
         */
        return "user";
    }

    /*
    多对多查询
     */
    @ResponseBody
    @RequestMapping("/user2/getUserById")
    public User2 getUserById(int userId) {//自动匹配参数

        return user2Dao.getUserById(userId);
    }


    @ResponseBody
    @RequestMapping("/user2/getUserByName")
    public List<User2> getUserByName(String name) {

        return user2Dao.getUserByName(name);
    }
}
