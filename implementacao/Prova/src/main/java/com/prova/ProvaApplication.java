package com.prova;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.domain.Filial;
import com.repositories.FilialRepository;

@SpringBootApplication
public class ProvaApplication {//implements CommandLineRunner{

	//@Autowired
	//private FilialRepository repoFilial;	
	
	public static void main(String[] args) {
		SpringApplication.run(ProvaApplication.class, args);
	}

	//@Override
	//public void run(String... args) throws Exception {
		
		//Filial f1 = new Filial(null, "Filial de Teste");
		//repoFilial.saveAll(Arrays.asList(f1));;
	//}
}
