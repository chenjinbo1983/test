package com.example.springboot.mapper;

import com.example.springboot.model.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {
    @Select("SELECT * FROM test")
    List<Test> findAll();

}
