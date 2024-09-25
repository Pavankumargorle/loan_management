package com.example.loan_management_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })

public class LoanManagementBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanManagementBackendApplication.class, args);
	}

}
