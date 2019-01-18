package br.com.movieloc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/movieloc", "root", "sua senha aqui");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
