package com.test.ssm.dao;

import com.test.ssm.model.MonitorTaskConfig;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 接口形式的dao，sql写在注解中
 */
@Repository
public interface MonitorTaskConfigDao {

    //使用接口注解的方式，实现一对多查询
    @Results({
            @Result(property="configValue",column="config_value"),
            @Result(property = "monitorTaskList",javaType = List.class,column = "monitor_task_id",
            many = @Many(select = "com.test.ssm.dao.MonitorTaskDao.getById"))
    })
    //@Select("select mtc.id as id,mtc.config_name as configName,mtc.config_value,mtc.config_unit,mtc.config_commnet,monitorTask.id ,monitorTask.name from monitor_task monitorTask,monitor_task_config mtc where monitorTask.id = mtc.monitor_task_id ")
    @Select("select mtc.monitor_task_id,mtc.id,mtc.config_name,mtc.config_value,mtc.config_unit,mtc.config_commnet from monitor_task_config mtc")
    public List<MonitorTaskConfig> getAll();
}
