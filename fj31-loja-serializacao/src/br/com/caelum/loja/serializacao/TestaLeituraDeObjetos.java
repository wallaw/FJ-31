package br.com.caelum.loja.serializacao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class TestaLeituraDeObjetos {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ios = new ObjectInputStream(new FileInputStream("livros.txt"));
		List<Livro> livros = (List<Livro>)ios.readObject();
		
		for (Livro l: livros){
			System.out.println(l.getNome());
		}
	}
}
