package com.example.mysql.mapper;

import com.example.mysql.entity.TestBoolean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<TestBoolean> selectTestBooleans();
}
