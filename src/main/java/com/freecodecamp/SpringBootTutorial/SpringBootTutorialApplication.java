package com.freecodecamp.SpringBootTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTutorialApplication {

	public static void main(String[] args) {
		var hello = 2;
		SpringApplication.run(SpringBootTutorialApplication.class, args);
	}

}
