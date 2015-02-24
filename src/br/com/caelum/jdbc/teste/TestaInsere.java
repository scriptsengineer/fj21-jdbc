package br.com.caelum.jdbc.teste;

import java.util.GregorianCalendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {
	public static void main(String[] args){
		Contato contato = new Contato();
		contato.setNome("Guilherme");
		contato.setEmail("guilhermemoraiscorrea@gmail.com");
		contato.setEndereco("Rua Santa Rosa n07, Santa Maria, RS");
		contato.setDataNascimento(new GregorianCalendar(1997,1,5));
		
		ContatoDao dao = new ContatoDao();
		dao.adicionaContato(contato);
		
		System.out.println("Gravado!");
	}
}
