package com.bikash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootMvcProj01HomePageApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj01HomePageApplication.class, args);
	}
//This is not useful when we run the application using External Server
	//Its useful when we use Embedded server
}
