package com.bank.bankAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class BankApiApplication {

	public static ArrayList<String> bankQueue = new ArrayList<>(Arrays.asList("deposit_100", "withdraw_300", "withdraw_243"));

	public static void main(String[] args) {
		SpringApplication.run(BankApiApplication.class, args);
	}

}
