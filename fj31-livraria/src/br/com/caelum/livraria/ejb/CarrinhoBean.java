package br.com.caelum.livraria.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import br.com.caelum.livraria.modelo.Livro;

@Stateful
@Remote (Carrinho.class)
public class CarrinhoBean implements Carrinho {

	private List<Livro> livros = new ArrayList<Livro>();
	private double total;
	
	
	@Override
	public void addLivro(Livro livro) {
		System.out.println("Addicionaodo o livro"+livro.getNome() + " ao carrinho.");
		this.livros.add(livro);
		
		
	}

	@Override
	public List<Livro> getLivros() {
		System.out.println("Carrinho devolvendo a lista de livros: ");
		return this.livros;
	}

	@Override
	public double getTotal() {
		System.out.println("Carrinho devolvendo o total: " + total);
		return this.total;
	}

	@Override
	public void finalizarCompra() {
		System.out.println("Finalizando a compra de: ");
		for(Livro livro : this.livros){
			System.out.println(livro.getPreco() + " - " + livro.getNome());
		}
	}

}
