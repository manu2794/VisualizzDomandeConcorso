package com.ags.VisualizzDomandeConcorso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class VisualizzDomandeConcorsoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisualizzDomandeConcorsoApplication.class, args);
	}
}
