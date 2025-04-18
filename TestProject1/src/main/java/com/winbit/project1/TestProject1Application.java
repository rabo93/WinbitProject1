package com.winbit.project1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.winbit.project1.mapper")
public class TestProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(TestProject1Application.class, args);
	}

}
