package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//用来发现config-server服务，利用其来加载应用配置
@EnableDiscoveryClient
public class ConfigClientEurekaApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigClientEurekaApplication.class).web(true).run(args);
	}
}
