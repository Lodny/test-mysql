package com.example.mysql.service;

import com.example.mysql.entity.TestBoolean;
import com.example.mysql.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestService {
    private final TestMapper testMapper;

    public List<TestBoolean> getTestBooleans() {
        log.info("getTestBooleans() : 1={}", 1);
        return testMapper.selectTestBooleans();
    }
}
