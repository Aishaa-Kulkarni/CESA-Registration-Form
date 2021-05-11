package com.cesaregistration.pojo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	private static final String DB_DRIVER_CLASS = "oracle.jdbc.OracleDriver";
	private static final String DB_USERNAME = "localhost";
	private static final String DB_PASSWORD = "localhost";
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	private static Connection connection = null;
	
	static {
			try {
				Class.forName(DB_DRIVER_CLASS);
				/*
				 * Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME,
				 * DB_PASSWORD);
				 */
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "localhost", "localhost");
			} catch (ClassNotFoundException  | SQLException e) {
				e.printStackTrace();
			}
		} 
	
	public static Connection getConnection() {
		return connection;
	}
}

