package com.example.mysql;

import com.example.mysql.service.TestService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


@SpringBootTest
class MysqlApplicationTests {

//	@MockBean
//	private final TestService testService;

//    MysqlApplicationTests(final TestService testService) {
//        this.testService = testService;
//    }

    @BeforeEach
	void setUp() {

	}

	@Test
	void contextLoads() {
	}

	@Test
	void testMapper() {
//		System.err.println("testMapper() : testService : " + testService);
	}

}
