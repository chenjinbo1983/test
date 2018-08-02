package com.example.springboot.mapper;

import com.example.springboot.model.CbhTransactLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CbhTransactLogMapper {
    static final String COLUMN = " id,appid,phone,type,starttime,endtime,region,status,point,jobnumber,creattime,updatetime ";
    @Select("SELECT "+COLUMN+" FROM cbh_transact_log")
    List<CbhTransactLog> findAll();

}
