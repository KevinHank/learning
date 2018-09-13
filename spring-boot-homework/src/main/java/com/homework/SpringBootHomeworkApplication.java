package com.homework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.homework.mapper")
public class SpringBootHomeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHomeworkApplication.class, args);
	}
}
