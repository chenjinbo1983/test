package com.test.ssm.controller;


import com.test.ssm.dao.CbhTransactLog2Dao;
import com.test.ssm.dao.CbhTransactLogDao;
import com.test.ssm.model.CbhTransactLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/log")
public class TransactLogController {

    @Autowired
    CbhTransactLogDao cbhTransactLogDao;

    @Autowired
    CbhTransactLog2Dao cbhTransactLog2Dao;

    @ResponseBody
    @RequestMapping(value="/transactLog/{id}",method=RequestMethod.GET)
    public CbhTransactLog getTransactLogById(@PathVariable("id") int id) {
        System.out.println(id);
        CbhTransactLog cbhTransactLog = cbhTransactLogDao.getById(id);
        return cbhTransactLog;
    }

    @ResponseBody
    @RequestMapping(value="/transactLog2/{id}",method=RequestMethod.GET)
    public CbhTransactLog getTransactLogById2(@PathVariable("id") int id) {
        System.out.println(id);
        CbhTransactLog cbhTransactLog = cbhTransactLog2Dao.getById(id);
        return cbhTransactLog;
    }

    @ResponseBody
    @RequestMapping(value="/transactLog2",method=RequestMethod.GET)
    public List<CbhTransactLog> getTransactLogList(int begin, int end) {

        return cbhTransactLog2Dao.selectAll(begin,end);
    }

    @ResponseBody
    @RequestMapping(value="/transactLog/insert")
    public int insertTransactLog() {
        CbhTransactLog cbhTransactLog = new CbhTransactLog();
        cbhTransactLog.setAppid("800120140306140849");
        cbhTransactLog.setType("HJ0001");
        cbhTransactLog.setRegion("851");
        cbhTransactLog.setStatus("1");
        cbhTransactLog.setJobnumber("95550005");
        cbhTransactLog.setCreattime(1394086213893l);
        int id = cbhTransactLog2Dao.insert(cbhTransactLog);
        // 生成的ID，从对象中获取
        System.out.println(cbhTransactLog.getId());
        return id;
    }
}
