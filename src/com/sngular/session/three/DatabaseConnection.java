package com.sngular.session.three;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
		    Class.forName("org.postgresql.Drive");
		    String url = "jdbc:postgresql://localhost:5432/trainning";
		    String user = "trainning";
		    String pass = "tr41nn1ng";
		    connection = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException ex) {
		    System.err.println("No se encontro el Driver Postgresql para JDBC.");
		    ex.printStackTrace();
		} catch (SQLException e) {
			System.err.println("No se fue posible conectarse a la BD.");
			e.printStackTrace();
		}
		return connection;
	}

}
