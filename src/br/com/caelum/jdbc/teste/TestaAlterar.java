package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAlterar {
	
	public static void main(String[] args) {
		Contato contato  = new Contato();
		contato.setNome("Maicao");
		contato.setEndereco("Rua Sabará nº 45, Jardim das Rosas");
		contato.setId(new Long(1));
		contato.setEmail("leandro@gmail.com");
		contato.setDatanascimento(Calendar.getInstance());
		ContatoDao dao = new ContatoDao();
		dao.alteraContato(contato);
		System.out.println("Contato alterado com sucesso!");
	}
}
