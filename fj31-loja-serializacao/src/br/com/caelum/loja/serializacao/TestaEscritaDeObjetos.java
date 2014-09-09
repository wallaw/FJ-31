package br.com.caelum.loja.serializacao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestaEscritaDeObjetos  {
	public static void main (String[] args) throws IOException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("livros.txt"));
		
		
		Livro l1 = new Livro();
		l1.setNome("Pais e Filhos");
		l1.setPreco(100.0);
		
		Livro l2 = new Livro();
		l2.setNome("Noites brancas");
		l2.setPreco(200.0);
		
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(l1);
		livros.add(l2);
		
		oos.writeObject(livros);
		oos.close();
	}
}
