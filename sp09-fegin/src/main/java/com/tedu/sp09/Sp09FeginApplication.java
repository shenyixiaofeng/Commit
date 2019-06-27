package com.tedu.sp09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class Sp09FeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp09FeginApplication.class, args);
	}

}
