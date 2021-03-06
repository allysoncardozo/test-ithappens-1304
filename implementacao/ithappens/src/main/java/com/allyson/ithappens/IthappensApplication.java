package com.allyson.ithappens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.allyson.ithappens.classes.Criptografia;
import com.allyson.ithappens.domain.Cliente;
import com.allyson.ithappens.domain.Estoque;
import com.allyson.ithappens.domain.Filial;
import com.allyson.ithappens.domain.FormaPagamento;
import com.allyson.ithappens.domain.ItensPedido;
import com.allyson.ithappens.domain.PedidoEstoque;
import com.allyson.ithappens.domain.PedidoEstoque.eTipoPedidoEstoque;
import com.allyson.ithappens.domain.Produto;
import com.allyson.ithappens.domain.Usuario;
import com.allyson.ithappens.repositories.ClienteRepository;
import com.allyson.ithappens.repositories.EstoqueRepository;
import com.allyson.ithappens.repositories.FilialRepository;
import com.allyson.ithappens.repositories.FormasPagamentoRepository;
import com.allyson.ithappens.repositories.ItensPedidoRepository;
import com.allyson.ithappens.repositories.PedidoEstoqueRepository;
import com.allyson.ithappens.repositories.ProdutoRepository;
import com.allyson.ithappens.repositories.UsuarioRepository;
import com.allyson.ithappens.services.ItensPedidoService;

@SpringBootApplication
public class IthappensApplication implements CommandLineRunner {


	@Autowired
	EstoqueRepository repoEstoque;
	@Autowired
	UsuarioRepository repoUsuario;
	@Autowired
	FilialRepository repoFilial;
	@Autowired
	ProdutoRepository repoProduto;
	@Autowired
	PedidoEstoqueRepository repoPedido;
	@Autowired
	ClienteRepository repoCliente;
	@Autowired
	FormasPagamentoRepository repoFormasPagamnto;

	@Autowired
	ItensPedidoRepository itemPedidoRepository;

	
	public static void main(String[] args) {
		SpringApplication.run(IthappensApplication.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		IniciarUsuario();
		IniciarFiliais();
		IniciarFormasPagamento();
		IniciarProdutos();
		IniciarClientes();
		IniciarPedidoEstoque();
		IniciarEstoque();
		IniciarItemPedido();
	}

	private void IniciarUsuario() {
		String senhaCriptografada = Criptografia.Criptografar("ithappens");
		Usuario u = new Usuario(null, "Allyson", senhaCriptografada);		
		repoUsuario.saveAll(Arrays.asList(u));
	}
	
	private void IniciarFiliais() {

		Filial f = new Filial(null, "Filial de Teste");
		Filial f2 = new Filial(null, "Segunda Filial de Teste");
		
		repoFilial.saveAll(Arrays.asList(f, f2));
	}

	
	private void IniciarClientes() {

		Cliente c = new Cliente(null, "Allyson Cardozo da Silva");
		Cliente c1 = new Cliente(null, "Rosita Almeida Silva");
		Cliente c2 = new Cliente(null, "Emilly Happuque Almeida Silva");
		Cliente c3 = new Cliente(null, "Melinda Almeida Silva");
		Cliente c4 = new Cliente(null, "Elizete Cardozo da Silva");
		Cliente c5 = new Cliente(null, "Antonio Francisco de Melo da Silva");		
		
		repoCliente.saveAll(Arrays.asList(c, c1, c2, c3, c4, c5));
	}
	
	private void IniciarFormasPagamento() {
		FormaPagamento f = new FormaPagamento(null, "À VISTA");
		FormaPagamento f1 = new FormaPagamento(null, "BOLETO");
		FormaPagamento f2 = new FormaPagamento(null, "CARTÃO");
		
		repoFormasPagamnto.saveAll(Arrays.asList(f, f1, f2));
	}
	
	private void IniciarEstoque() {

		List<Estoque> lista = new ArrayList<>();
		
		List<Produto> produtos = repoProduto.findAll();
		List<Filial> filiais = repoFilial.findAll();

		produtos.forEach(prod -> {
			filiais.forEach(est -> {			
				
				var e = new Estoque(null, 100, prod, est);
				lista.add(e);
				
			});
		});
		
		
		repoEstoque.saveAll(lista);
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

	private void IniciarPedidoEstoque() {
		
		List<Usuario> usuarios = repoUsuario.findAll();
		List<Cliente> clientes = repoCliente.findAll();
		Filial filial = repoFilial.getOne(1);

		List<PedidoEstoque> lista = new ArrayList<>();
		
		usuarios.forEach(user -> {
			clientes.forEach(cli -> {
				PedidoEstoque pe = new PedidoEstoque(null, eTipoPedidoEstoque.saida, filial, user, cli, "CPF na nota, Senhor?", 0.00);
				lista.add(pe);
			});
		});
		
		repoPedido.saveAll(lista);
	}
	@Autowired
	ItensPedidoService itemService;
	private void IniciarItemPedido() {
		//(Integer id, Integer quantidade, Produto produto, PedidoEstoque pedidoEstoque, FormaPagamento formaPagamento) {
		FormaPagamento formaPagamento = repoFormasPagamnto.getOne(1);
		List<Produto> produtos = repoProduto.findAll();
		List<ItensPedido> itens = new ArrayList<ItensPedido>();
		
		List<PedidoEstoque> vendas = repoPedido.findAll();
		produtos.forEach(prod -> {
		vendas.forEach(venda -> {
			ItensPedido item = new ItensPedido(null, 10, prod, venda, formaPagamento);			
			itens.add(item);
			});
		});
		
		//para forçar as validações e diminuir a quantidade dentro do estoque
		itens.forEach(p -> { itemService.Salvar(p); });
		vendas.forEach(vd -> {
			   Double somatorio = itens.stream().filter(it -> it.getPedidoEstoque().getId().equals(vd.getId())).mapToDouble(d -> d.getValorPedido()).sum();
			   vd.setValor(somatorio);			   
			});
		repoPedido.saveAll(vendas);
		
		itemPedidoRepository.saveAll(itens);
	}
}
