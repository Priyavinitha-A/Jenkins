package com.springBoot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringBoot3Application {
	private static final Logger logger = LoggerFactory.getLogger(SpringBoot3Application.class);
	public static void main(String[] args) {
		logger.info("This is a info message");
		logger.warn("This is a warn message");
		logger.error("This is a error message");
		SpringApplication.run(SpringBoot3Application.class, args);
	}

}
