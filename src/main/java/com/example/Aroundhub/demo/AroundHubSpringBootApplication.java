package com.example.Aroundhub.demo;

import com.example.Aroundhub.demo.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AroundHubSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AroundHubSpringBootApplication.class, args);
	}

}
