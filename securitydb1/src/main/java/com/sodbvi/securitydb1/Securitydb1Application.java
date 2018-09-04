package com.sodbvi.securitydb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ="com.sodbvi.securitydb1")
@SpringBootApplication
public class Securitydb1Application {

	public static void main(String[] args) {
		SpringApplication.run(Securitydb1Application.class, args);
	}
}
