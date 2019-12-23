package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaPesquisa {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		Contato contato = dao.pesquisarContato(1);
		imprimeValores(contato);
	}

	private static void imprimeValores(Contato contato) {
		System.out.println("Nome:	" + contato.getNome());
		System.out.println("Email:	" + contato.getEmail());
		System.out.println("Endereço:	" + contato.getEndereco());
		System.out
				.println("Data	de	Nascimento:	" + retornaDataFormatada(contato.getDatanascimento().getTime()) + "\n");
	}

	private static String retornaDataFormatada(Date data) {
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
		return format1.format(data);
	}

}
