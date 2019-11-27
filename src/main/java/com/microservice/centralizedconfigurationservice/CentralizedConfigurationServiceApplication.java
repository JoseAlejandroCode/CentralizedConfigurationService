package com.microservice.centralizedconfigurationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class CentralizedConfigurationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralizedConfigurationServiceApplication.class, args);
	}

}
