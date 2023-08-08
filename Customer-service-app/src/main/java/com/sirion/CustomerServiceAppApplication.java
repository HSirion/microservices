package com.sirion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class CustomerServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceAppApplication.class, args);
	}

}
