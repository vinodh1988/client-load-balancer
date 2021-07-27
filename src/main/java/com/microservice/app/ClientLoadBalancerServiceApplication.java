package com.microservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientLoadBalancerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientLoadBalancerServiceApplication.class, args);
	}

}
