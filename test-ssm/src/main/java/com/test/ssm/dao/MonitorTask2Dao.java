package com.test.ssm.dao;

import com.test.ssm.model.MonitorTask;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonitorTask2Dao {

    public List<MonitorTask> getAll();
}
