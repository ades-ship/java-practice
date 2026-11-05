package com.example.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

	public void printing(String firstName, String lastName){
		System.out.println(firstName+""+lastName);
		System.out.println("WIILL SEE YOU SOON");
	}
   
	
}
