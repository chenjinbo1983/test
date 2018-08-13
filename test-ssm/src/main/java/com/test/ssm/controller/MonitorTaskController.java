package com.test.ssm.controller;


import com.test.ssm.dao.MonitorTask2Dao;
import com.test.ssm.dao.MonitorTaskConfig2Dao;
import com.test.ssm.dao.MonitorTaskConfigDao;
import com.test.ssm.model.MonitorTask;
import com.test.ssm.model.MonitorTaskConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/monitorTask")
public class MonitorTaskController {

    @Autowired
    MonitorTask2Dao monitorTask2Dao;


    @ResponseBody
    @RequestMapping("/getAll")
    public List<MonitorTask> getAll() {//自动匹配参数
        List<MonitorTask> monitorTasks = monitorTask2Dao.getAll();
        return monitorTasks;
    }


}
