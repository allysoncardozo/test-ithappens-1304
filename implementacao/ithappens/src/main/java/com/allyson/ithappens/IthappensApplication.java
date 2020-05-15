package com.allyson.ithappens;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.allyson.ithappens.domain.Filial;
import com.allyson.ithappens.repositories.FilialRepository;

@SpringBootApplication
public class IthappensApplication implements CommandLineRunner {

	@Autowired
	FilialRepository repoFilial;
	
	public static void main(String[] args) {
		SpringApplication.run(IthappensApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Filial f = new Filial(null, "Filial de Teste");
		Filial f2 = new Filial(null, "Segunda Filial de Teste");
		
		repoFilial.saveAll(Arrays.asList(f, f2));
	}
}
