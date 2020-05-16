package com.allyson.ithappens.domain;


import javax.persistence.Entity;

import com.allyson.ithappens.abstratos.ABase;

@Entity
public class FormaPagamento extends ABase<FormaPagamento> {

	private static final long serialVersionUID = 1L;
	
	//1 boleto, 2 à vista, 3 no cartão
	private Integer Tipo;
	public FormaPagamento(){
		
	}
}