package com.allyson.ithappens;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.allyson.ithappens.domain.Filial;
import com.allyson.ithappens.domain.Produto;
import com.allyson.ithappens.repositories.FilialRepository;
import com.allyson.ithappens.repositories.ProdutoRepository;

@SpringBootApplication
public class IthappensApplication implements CommandLineRunner {

	@Autowired
	FilialRepository repoFilial;
	@Autowired
	ProdutoRepository repoProduto;
	
	public static void main(String[] args) {
		SpringApplication.run(IthappensApplication.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		IniciarFiliais();
		IniciarProdutos();
	}	

	private void IniciarFiliais() {

		Filial f = new Filial(null, "Filial de Teste");
		Filial f2 = new Filial(null, "Segunda Filial de Teste");
		
		repoFilial.saveAll(Arrays.asList(f, f2));
	}

	private void IniciarProdutos() {

		Produto p1 = new Produto(null, "Sabonete", 1.99, "11111111111");
		Produto p2 = new Produto(null, "Creme dental", 3.0, "2222222222");
		Produto p3 = new Produto(null, "Escova de dentes(3 em 1)", 7.5, "3333333333");
		Produto p4 = new Produto(null, "Arroz Urbaninho 1kg", 3.29, "4444444444");
		Produto p5 = new Produto(null, "Feijão Ouro Preto 1kg", 4.75, "5555555555");
		Produto p6 = new Produto(null, "Café 250g", 2.89, "6666666666");
		Produto p7 = new Produto(null, "Açúcar 1kg", 2.45, "7777777777");
		Produto p8 = new Produto(null, "Leite Piracanjuba", 3.99, "8888888888");
		Produto p9 = new Produto(null, "Biscoito Treloso 3 em 1", 6.45, "9999999999");
		Produto p10 = new Produto(null, "Vinagre Minhoto", 2.69, "0000000000");		
		repoProduto.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10));
	}
}
