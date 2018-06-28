package com.ynhuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 启动定时
public class SpringbootHttpclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHttpclientApplication.class, args);
	}
}
