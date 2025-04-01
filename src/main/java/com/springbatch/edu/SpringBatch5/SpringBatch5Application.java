package com.springbatch.edu.SpringBatch5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBatch5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatch5Application.class, args);
	}

}
