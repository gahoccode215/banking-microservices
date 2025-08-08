package com.gahoccode.finance.banking_core_service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BankingCoreServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingCoreServiceRegistryApplication.class, args);
	}

}
