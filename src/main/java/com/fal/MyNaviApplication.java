package com.fal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fal.mapper")
public class MyNaviApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyNaviApplication.class, args);
	}

}
