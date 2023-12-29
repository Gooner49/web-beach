package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories (basePackageClasses =CustRepo.class)
public class DemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}
