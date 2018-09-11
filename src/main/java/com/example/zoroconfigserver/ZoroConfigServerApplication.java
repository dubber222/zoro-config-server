package com.example.zoroconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class ZoroConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoroConfigServerApplication.class, args);
	}
}
