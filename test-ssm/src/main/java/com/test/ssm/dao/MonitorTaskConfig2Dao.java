package com.test.ssm.dao;

import com.test.ssm.model.MonitorTaskConfig;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * XML形式的dao，sql写在xml中
 */
@Repository
public interface MonitorTaskConfig2Dao {

    public List<MonitorTaskConfig> getAll();
}
