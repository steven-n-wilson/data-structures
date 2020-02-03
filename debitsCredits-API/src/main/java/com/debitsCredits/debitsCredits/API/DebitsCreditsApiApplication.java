package com.debitsCredits.debitsCredits.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DebitsCreditsApiApplication {

	public static int bankDebits[] = {1,2,3,4,5,6,7,8,9,10};
	public static int bankCredits[] = {1,2,3,4,5};

	public static void main(String[] args) {
		SpringApplication.run(DebitsCreditsApiApplication.class, args);
	}

}
