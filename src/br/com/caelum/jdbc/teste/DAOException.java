package br.com.caelum.jdbc.teste;

public class DAOException extends RuntimeException {

	public DAOException() {
		super("Erro desconhecido!");
	}
	
	public DAOException(Exception ex) {
		super(ex);
	}
	
}
