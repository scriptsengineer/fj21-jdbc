package br.com.caelum.jdbc.teste;

import java.util.GregorianCalendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {
	public static void main(String[] args){
		Contato contato = new Contato();
		contato.setNome("Gabriel Morais Correa");
		contato.setEmail("gabrielmoraiscorrea@gmail.com");
		contato.setEndereco("Rua Santa Rosa n07, Santa Maria, RS");
		contato.setDataNascimento(new GregorianCalendar(1999,5,24));
		
		ContatoDao dao = new ContatoDao();
		dao.adicionaContato(contato);
		
		System.out.println("Gravado!");
	}
}
