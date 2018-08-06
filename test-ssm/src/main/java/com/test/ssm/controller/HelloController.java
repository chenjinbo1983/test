package com.test.ssm.controller;


import com.test.ssm.model.User;
import com.test.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
@RequestMapping("/hello")
public class HelloController {


    @RequestMapping("/hello")
    public String hello(String name,double age) {//自动匹配参数
        System.out.println(name+"  "+age);
        return "hello";
    }

    //通过RequestParam，指定前端传来的参数名
    @RequestMapping("/hello2")
    public String hello2(@RequestParam(value="username") String name, double age) {
        System.out.println(name+"  "+age);
        return "hello";
    }

    //在Controller中使用redirect方式处理请求
    @RequestMapping("/redirect")
    public String redirect(@RequestParam(value="username") String name, double age) {
        System.out.println(name+"  "+age);
        //转发请求,并参数传递
        return "redirect:test?age="+age;
    }

    @RequestMapping("/test")
    public String test(double age) {

        return "hello";
    }
    /*上传*/
    @POST
    @RequestMapping(value="/upload",method= RequestMethod.POST)
    public String upload(HttpServletRequest req) throws Exception{
        MultipartHttpServletRequest mreq = (MultipartHttpServletRequest)req;
        MultipartFile file = mreq.getFile("file");
        String fileName = file.getOriginalFilename();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        FileOutputStream fos = new FileOutputStream(req.getSession().getServletContext().getRealPath("/")+
                "upload/"+sdf.format(new Date())+fileName.substring(fileName.lastIndexOf('.')));
        fos.write(file.getBytes());
        fos.flush();
        fos.close();

        return "hello";
    }
}
