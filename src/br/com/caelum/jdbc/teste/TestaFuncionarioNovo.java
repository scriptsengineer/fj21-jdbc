package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaFuncionarioNovo {
	public static void main(String[] args){
		FuncionarioDAO dao = new FuncionarioDAO();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Gabriel Morais Correa");
		funcionario.setUsuario("GMC");
		funcionario.setSenha("1234");
		
		dao.adicionaFuncionario(funcionario);
		System.out.println("Adicionado com sucesso!");
	}
}
