package com.line21k.vibionusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VibionUserService {

	public static void main(String[] args) {
		SpringApplication.run(VibionUserService.class, args);
	}

}
