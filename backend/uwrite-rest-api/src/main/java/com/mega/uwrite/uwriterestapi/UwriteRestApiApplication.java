package com.mega.uwrite.uwriterestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class UwriteRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UwriteRestApiApplication.class, args);
	}

}
