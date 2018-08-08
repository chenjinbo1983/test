package com.test.ssm.dao;


import com.test.ssm.model.CbhTransactLog;
import com.test.ssm.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 接口形式的dao，sql写在注解中
 */
@Repository
public interface CbhTransactLogDao {

    @Select("select * from cbh_transact_log where id = #{id}")
    CbhTransactLog getById(@Param("id") int id);

}
