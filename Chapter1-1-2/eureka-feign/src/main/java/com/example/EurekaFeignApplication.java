package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
//在应用主类中通过@EnableFeignClients注解开启Feign功能
@EnableFeignClients
public class EurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignApplication.class, args);
	}
}