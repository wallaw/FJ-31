package br.com.caelum.loja.rmi;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoBean extends UnicastRemoteObject implements Carrinho {

	private double total;
	private List<Livro> livros = new ArrayList<Livro>();
	
	public CarrinhoBean() throws RemoteException {
		super();
	}

	@Override
	public void addLivro(Livro livro) throws RemoteException {
		livros.add(livro);
		total+=livro.getPreco();

		System.out.printf("Livro %s adicionado. Preço:%f\n", livro.getNome(),livro.getPreco());
		System.out.println(this);
	}

	@Override
	public List<Livro> getLivros() throws RemoteException {
		livros.get(2);
		return this.livros;
	}

	@Override
	public double getTotal() throws RemoteException {
		return this.total;
	}

}
