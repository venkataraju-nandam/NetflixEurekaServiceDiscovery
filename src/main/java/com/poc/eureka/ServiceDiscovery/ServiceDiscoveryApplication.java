package com.poc.eureka.ServiceDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages={"com.poc.eureka.ServiceDiscovery"})
@SpringBootApplication
@EnableEurekaServer	
public class ServiceDiscoveryApplication {

	public static void main(String[] args) {
		System.out.println("---------------------------------------BEFORE ServiceDiscoveryApplication---------------------------");
		SpringApplication.run(ServiceDiscoveryApplication.class, args);
		System.out.println("---------------------------------------AFTER ServiceDiscoveryApplication---------------------------");
	}

}
