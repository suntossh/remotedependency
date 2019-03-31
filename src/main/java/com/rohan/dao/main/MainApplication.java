package com.rohan.dao.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.rohan")
public class MainApplication {

	public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
