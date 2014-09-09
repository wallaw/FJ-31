package br.com.caelum.loja.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RegistraCarrinho {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		LocateRegistry.createRegistry(1099);
		
		Naming.rebind("loja/carrinho", new CarrinhoBean());
		System.out.println("carrinho registrado");
	}

}
