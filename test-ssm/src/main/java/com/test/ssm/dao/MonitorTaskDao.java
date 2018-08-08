package com.test.ssm.dao;

import com.test.ssm.model.MonitorTask;
import com.test.ssm.model.MonitorTaskConfig;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonitorTaskDao {

    @Select("select id,name from monitor_task where id = #{id}")
    public List<MonitorTask> getById(int id);
}
