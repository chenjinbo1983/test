package com.test.ssm.controller;


import com.test.ssm.dao.UserDao;
import com.test.ssm.model.User;
import com.test.ssm.service.IUserService;
import com.test.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
/*
@Controller 负责注册一个bean 到spring 上下文中
@RequestMapping 注解为控制器指定可以处理哪些 URL 请求*/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    IUserService iUserService;

    @RequestMapping("/hello")
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

    // 返回json数据
    @ResponseBody
    @RequestMapping("/helloJson")
    public List<User> helloJson() {
        List<User> users = userService.getAll();
        System.out.println("test");
//        System.out.println(users.get(0).getId());

        /*
        spring-mvc.xml，有如下配置
        <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
            <property name="prefix" value="/WEB-INF/views/" />
            <property name="suffix" value=".jsp"/>
        </bean>
         所以转向/WEB-INF/views/user.jsp
         */
        return users;
    }

    /*自动装箱,请求地址为
    * http://localhost:8094/user/update?userName=chen&id=11
    * */
    @RequestMapping("/update")
    public String update(User user) {
        System.out.println(user.getId()+"  "+user.getUserName());
        return "hello";
    }

    // 返回json数据
    @ResponseBody
    @RequestMapping("/getAllUser")
    public List<User> getAllUser() {
        List<User> users = iUserService.getAllUser();
        System.out.println("test");
//        System.out.println(users.get(0).getId());

        /*
        spring-mvc.xml，有如下配置
        <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
            <property name="prefix" value="/WEB-INF/views/" />
            <property name="suffix" value=".jsp"/>
        </bean>
         所以转向/WEB-INF/views/user.jsp
         */
        return users;
    }
}
