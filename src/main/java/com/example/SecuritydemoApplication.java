package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecuritydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritydemoApplication.class, args);
		
		System.out.println("Server has been started");
	}
}