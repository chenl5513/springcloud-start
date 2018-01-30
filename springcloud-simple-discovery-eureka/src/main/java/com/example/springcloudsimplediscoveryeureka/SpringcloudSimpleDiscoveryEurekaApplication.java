package com.example.springcloudsimplediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudSimpleDiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudSimpleDiscoveryEurekaApplication.class, args);
	}
}
