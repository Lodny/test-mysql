package com.example.mysql.controller;

import com.example.mysql.entity.TestBoolean;
import com.example.mysql.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TestBooleanController {

    private final TestService testService;

    @GetMapping("/boolean")
    public ResponseEntity<?> testBoolean() {
        log.info("testBoolean() : 1={}", 1);

        List<TestBoolean> testBooleans = testService.getTestBooleans();
        log.info("testBoolean() : testBooleans={}", testBooleans);

        return ResponseEntity.ok(testBooleans);
    }
}
