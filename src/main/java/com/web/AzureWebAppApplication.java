package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AzureWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureWebAppApplication.class, args);
	}

	@GetMapping("/")
	public String sayHello(){
		return "Hello World!..";
	}

}
