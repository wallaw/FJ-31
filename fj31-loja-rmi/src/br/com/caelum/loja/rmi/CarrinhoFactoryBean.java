package br.com.caelum.loja.rmi;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class CarrinhoFactoryBean extends UnicastRemoteObject implements
		CarrinhoFactory {

	public CarrinhoFactoryBean() throws RemoteException {
		super();
	}

	

	@Override
	public Carrinho create() throws RemoteException {
		CarrinhoBean carrinho = new CarrinhoBean();
		return carrinho;
	}

}
