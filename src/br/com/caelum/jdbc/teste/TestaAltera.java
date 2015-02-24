package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAltera {
	public static void main(String[] args){
		ContatoDao dao = new ContatoDao();
		Contato contato = dao.getContato(1L);
		contato.setNome("Rafael Morais Correa");
		dao.altera(contato);
		System.out.println("Contato alterado!");
	}
}
