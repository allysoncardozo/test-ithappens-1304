package com.allyson.ithappens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.allyson.ithappens.repositories.FilialRepository;

@SpringBootApplication
public class IthappensApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(IthappensApplication.class, args);
	}
}
