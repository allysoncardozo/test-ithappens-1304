package com.allyson.ithappens.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	
	public PedidoEstoque(Integer id, eTipoPedidoEstoque tipo, Filial filial, Usuario usuario, String observacao) {
		super();
		super.setId(id);
		Tipo = tipo;
		Filial = filial;
		Usuario = usuario;
	}

	@ManyToOne
	@JoinColumn(name="FilialId")
	private Filial Filial;
	

	@ManyToOne
	@JoinColumn(name="UsuarioId")
	private Usuario Usuario;
	
	private String Observacao;

	@OneToMany(mappedBy = "PedidoEstoque")
	private List<ItensPedido> ItensPedido = new ArrayList<ItensPedido>();
	
	private eTipoPedidoEstoque Tipo;
	
	public List<ItensPedido> getItensPedido() {
		return ItensPedido;
	}

	public void setItensPedido(List<ItensPedido> itensPedido) {
		ItensPedido = itensPedido;
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
