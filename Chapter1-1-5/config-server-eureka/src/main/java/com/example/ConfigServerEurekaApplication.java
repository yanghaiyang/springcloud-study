package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
//将config-server注册到上面配置的服务注册中心上去
@EnableDiscoveryClient
//开启Config Server
@EnableConfigServer
public class ConfigServerEurekaApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigServerEurekaApplication.class).web(true).run(args);
	}
}
