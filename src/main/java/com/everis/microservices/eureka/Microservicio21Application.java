package com.everis.microservices.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Microservicio21Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservicio21Application.class, args);
	}

}
