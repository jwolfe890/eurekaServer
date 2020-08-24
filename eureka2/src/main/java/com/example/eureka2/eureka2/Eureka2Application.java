package com.example.eureka2.eureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka2Application {

	public static void main(String[] args) {

		System.out.println("Hello");

		SpringApplication.run(Eureka2Application.class, args);
	}

}
