package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;

@SpringBootApplication (exclude=HibernateJpaAutoConfiguration.class)
public class MbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbootApplication.class, args);
	}
}
