package br.com.caelum.tarefas.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.caelum.tarefas.model.dao.ConnectionFactory;

public class ConnectionTest {

	public static void main (String [] args) throws SQLException, ClassNotFoundException {
		
		
		ConnectionFactory cf = new ConnectionFactory();
		
		System.out.print(cf.getConnection());
	
	
	}
}
