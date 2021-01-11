package com.meshal.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Main Class For Application 
// @SpringBootApplication = @EnableAutoConfiguration + @ComponentScan + @@Configuration
@SpringBootApplication
public class LoginFormSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginFormSecurityApplication.class, args);
	}

}
