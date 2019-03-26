package com.cts.connect_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.connect_project.bean.Login;
import com.cts.connect_project.util.DBUtils;

public class LoginDAOImpl implements LoginDAO {

	private Connection connection = null;
	@Override
	public int authenticateUser(Login login) {
		
		PreparedStatement preparedStatement = null;
		connection  = DBUtils.getConnection();
		
		ResultSet resultSet = null;
		String insertStatement ="select * from user where userid = ? and password = ? ";
		
		try {
			//System.out.println("inside DAO");
		
			connection.setAutoCommit(true);
			preparedStatement = connection.prepareStatement(insertStatement);
			
			String userId = login.getUserId();
			String password = login.getPassword();
			   
			preparedStatement.setString(1, userId);
				preparedStatement.setString(2, password);
		  
				resultSet = preparedStatement.executeQuery();
		
		  
		    if(resultSet.next())
			{
			 return 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally
		{
			DBUtils.closeConnection(connection);
		}
		return 0;
	}
	
	
	

}
