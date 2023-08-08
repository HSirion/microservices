package com.sirion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class LoginServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginServiceAppApplication.class, args);
	}

}
