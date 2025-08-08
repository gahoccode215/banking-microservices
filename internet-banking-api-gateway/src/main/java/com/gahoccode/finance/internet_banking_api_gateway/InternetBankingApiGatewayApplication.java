package com.gahoccode.finance.internet_banking_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
public class InternetBankingApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetBankingApiGatewayApplication.class, args);
	}

}
