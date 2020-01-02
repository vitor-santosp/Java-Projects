package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;

public class TestaExcluir {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		dao.excluirContato(1);
		System.out.println("Contato excluido com sucesso!");
	}
	
}
