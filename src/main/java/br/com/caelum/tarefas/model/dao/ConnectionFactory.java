package br.com.caelum.tarefas.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() throws ClassNotFoundException {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3311/sampledb", "root", "root");
            } catch (SQLException e) {
            return null;
        }
    }
}
