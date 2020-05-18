package com.allyson.ithappens.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.allyson.ithappens.abstratos.ABase;

@Entity
public class PedidoEstoque extends ABase<PedidoEstoque> {

	private static final long serialVersionUID = 1L;

	public enum eTipoPedidoEstoque{
		entrada,
		saida
	}
	public PedidoEstoque() {
		
	}
	
	public PedidoEstoque(Integer id, eTipoPedidoEstoque tipo, Filial filial, Usuario usuario, Cliente cliente, String observacao, Double valor) {
		super();
		super.setId(id);
		Tipo = tipo;
		Filial = filial;
		Usuario = usuario;
		Cliente = cliente;
		Observacao = observacao;
		Valor = valor;
	}

	@ManyToOne
	@JoinColumn(name="UsuarioId")
	private Usuario Usuario;

	@ManyToOne
	@JoinColumn(name="ClienteId")
	private Cliente Cliente;
	

	@ManyToOne
	@JoinColumn(name="FiialId")
	private Filial Filial;
	
	
	private String Observacao;
    private Double Valor;
	private eTipoPedidoEstoque Tipo;
	

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
	}

	public eTipoPedidoEstoque getTipo() {
		return Tipo;
	}

	public void setTipo(eTipoPedidoEstoque tipo) {
		Tipo = tipo;
	}




	public Filial getFilial() {
		return Filial;
	}

	public void setFilial(Filial filial) {
		Filial = filial;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}

	public String getObservacao() {
		return Observacao;
	}

	public void setObservacao(String observacao) {
		Observacao = observacao;
	}

}
