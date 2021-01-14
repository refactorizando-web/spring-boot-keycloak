package com.refactorizando.keycloak.example.infraestructure.config.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.refactorizando.example.keycloak.infraestructure")
public class KeycloakExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakExampleApplication.class, args);
	}

}
