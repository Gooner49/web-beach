package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
//@EnableEurekaClient
//@EnableMongoRepositories (basePackageClasses =CustRepo.class)
@EnableJpaRepositories (basePackageClasses =CustRepo.class)
public class DemoApplication 
{
	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}
}
