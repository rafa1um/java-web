package br.com.movieloc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/movieloc", "root", "920m");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
