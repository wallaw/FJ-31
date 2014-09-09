package br.com.caelum.loja.serializacao;

import java.io.Serializable;

public class Livro implements Serializable{

	private String nome;
	private double preco;
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setPreco(double preco){
		this.preco=preco;
	}
	
	public double getPreco(){
		return this.preco;
	}
	
}
