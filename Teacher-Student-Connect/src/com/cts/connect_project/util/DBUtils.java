package com.cts.connect_project.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	public final static String URL="jdbc:mysql://localhost:3306/test";
	public static final String driverName = "com.mysql.jdbc.Driver";
	public static final String userName="root";
	public static final String password = "root";
	
	public static Connection getConnection()
	{
		Connection connection = null;
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(URL,userName,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static void closeConnection(Connection connection)
	{
	try {
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
