package com.jforce.tr.smsgonderme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jforce.tr"})
@EntityScan(basePackages = {"com.jforce.tr"})
public class SmsGondermeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsGondermeApplication.class, args);
	}

}
