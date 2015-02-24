package br.com.caelum.jdbc.dao;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.modelo.Contato;

public class TestaPesquisa {
	public static void main(String[] args){
		ContatoDao dao = new ContatoDao();
		String texto = JOptionPane.showInputDialog("Digite texto de pesquisa");
		List<Contato> contatos = dao.getLista(texto);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		for(Contato contato : contatos){
			System.out.println();
			System.out.println("Contato ID("+contato.getId()+") Nome:"+contato.getNome());
			System.out.println("E-mail: "+contato.getEmail());
			System.out.println("Endereço: "+contato.getEndereco());
			System.out.println("Data de Nascimento: "+sdf.format(contato.getDataNascimento().getTime()));
		}
		if(contatos.size()<1){
			System.out.println("Não há contatos!");
		}
	}
}
