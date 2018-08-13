package com.test.ssm.controller;


import com.test.ssm.dao.MonitorTaskConfig2Dao;
import com.test.ssm.dao.MonitorTaskConfigDao;
import com.test.ssm.model.MonitorTaskConfig;
import org.springframework.beans.factory.annotation.Autowired;
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
import java.util.List;


@Controller
@RequestMapping("/monitorTaskConfig")
public class MonitorTaskConfigController {

    @Autowired
    MonitorTaskConfigDao monitorTaskConfigDao;

    @Autowired
    MonitorTaskConfig2Dao monitorTaskConfig2Dao;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<MonitorTaskConfig> getAll() {//自动匹配参数
        List<MonitorTaskConfig> monitorTaskConfigs = monitorTaskConfigDao.getAll();
        return monitorTaskConfigs;
    }

    @ResponseBody
    @RequestMapping("/getAll2")
    public List<MonitorTaskConfig> getAll2() {//自动匹配参数
        List<MonitorTaskConfig> monitorTaskConfigs = monitorTaskConfig2Dao.getAll();
        return monitorTaskConfigs;
    }
}
