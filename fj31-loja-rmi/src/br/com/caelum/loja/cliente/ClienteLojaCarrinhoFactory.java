package br.com.caelum.loja.cliente;

import java.rmi.Naming;

import br.com.caelum.loja.rmi.Carrinho;
import br.com.caelum.loja.rmi.CarrinhoFactory;
import br.com.caelum.loja.rmi.Livro;

public class ClienteLojaCarrinhoFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		CarrinhoFactory factory = (CarrinhoFactory) Naming.lookup("rmi://localhost:1099/loja/carrinhos");
		Carrinho carrinho = factory.create();
		
		Livro l1 = new Livro();
		l1.setNome("Pais e Filhos");
		l1.setPreco(20.0);
		
		Livro l2 = new Livro();
		l2.setNome("Noites Brancas");
		l2.setPreco(100.0);

		carrinho.addLivro(l1);
		carrinho.addLivro(l2);
		
		System.out.println(carrinho.getTotal());
	}

}
