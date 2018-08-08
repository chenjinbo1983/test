package com.test.ssm.dao;


import com.test.ssm.model.CbhTransactLog;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * xml形式的dao，sql写在XML中
 */
@Repository
public interface CbhTransactLog2Dao {

    CbhTransactLog getById(@Param("id") int id);

    List<CbhTransactLog> selectAll();


    int insert(CbhTransactLog log);

}
