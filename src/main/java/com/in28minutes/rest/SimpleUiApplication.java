package com.in28minutes.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SimpleUiApplication {

	@RequestMapping("/greeting")
	public Greeting greeting() {
		return new Greeting("Hello Vegas!");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleUiApplication.class, args);
	}
}
