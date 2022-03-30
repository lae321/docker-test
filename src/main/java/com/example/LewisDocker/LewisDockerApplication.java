package com.example.LewisDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LewisDockerApplication {

	@GetMapping("/hello")
	public String getGreeting() {
		return "Hello m8";
	}

	public static void main(String[] args) {
		SpringApplication.run(LewisDockerApplication.class, args);
	}

}
