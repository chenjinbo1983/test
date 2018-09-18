package com.test.ssm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
@RequestMapping("/date")
public class DateController {


    @RequestMapping("/test")
    @ResponseBody
    public Date test(Date date) {//自动匹配参数
        System.out.println(date);
        return date;
    }

}
