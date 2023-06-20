package com.platzi.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PlatziMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatziMarketApplication.class, args);
	}

}
