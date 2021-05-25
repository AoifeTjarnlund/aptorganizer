package com.yrgo.aptorganizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AptorganizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AptorganizerApplication.class, args);
	}

}
