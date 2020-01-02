package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInserirFuncionario {

	public static void main(String[] args) {
		FuncionarioDao dao = new FuncionarioDao();
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Fernando");
		funcionario.setSenha("123456");
		funcionario.setUsuario("Ferdinando");
		dao.adicionarFuncionario(funcionario);
		System.out.println("Usuario inserido com suceso!");
	}
	
}
