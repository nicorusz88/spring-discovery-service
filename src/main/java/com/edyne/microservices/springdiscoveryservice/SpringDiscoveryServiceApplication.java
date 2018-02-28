package com.edyne.microservices.springdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDiscoveryServiceApplication.class, args);
	}
}
