package com.rissins.employmentnotice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EmploymentnoticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmploymentnoticeApplication.class, args);
	}

}
