package com.example.endofthegame;

import com.example.homework.exercise1.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EndOfTheGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndOfTheGameApplication.class, args);
	}

	@Bean
	public Calculator calculator() {
		return new Calculator();
	}


}


