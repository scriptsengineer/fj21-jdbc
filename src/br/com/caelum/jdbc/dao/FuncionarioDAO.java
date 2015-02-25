package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.exception.DAOException;
import br.com.caelum.jdbc.modelo.Funcionario;

public class FuncionarioDAO {
	private Connection connection;

	public FuncionarioDAO() {
		connection = new ConnectionFactory().getConnection();
	}

	public void adicionaFuncionario(Funcionario funcionario) {

		String sql = "insert into funcionarios " + "(nome,usuario,senha) "
				+ "values (?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1,funcionario.getNome());
			stmt.setString(2,funcionario.getUsuario());
			stmt.setString(3,funcionario.getSenha());
			
			stmt.execute();
			stmt.close();
			
		} catch (SQLException ex) {
			throw new DAOException(ex);
		}
	}
}
