package com.cts.connect_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cts.connect_project.bean.Help;
import com.cts.connect_project.util.DBUtils;

public class HelpDaoImpl implements HelpDao {

	@Override
	public String insertHelp(Help help) {
		// TODO Auto-generated method stub
		String issue = help.getIssue();
		String des = help.getDescription();
		String email = help.getEmail();
		
		 PreparedStatement ps = null;
         try
         {
                Connection con = DBUtils.getConnection();
                //String query = "insert into users(SlNo,fullName,Email,userName,password) values (NULL,?,?,?,?)"; //Insert user details into the table 'USERS'
                String query = "insert into help values (?,?,?)";
                  
          ps = con.prepareStatement(query); // generates sql query

       ps.setString(1, issue);
       ps.setString(2, des);
       ps.setString(3, email);
    
        
       int i= ps.executeUpdate();
                if (i!=0){  //Just to ensure data has been inserted into the database
                return "success";} 
    
         }
         
         catch(SQLException e)
         {
                e.printStackTrace();
               
         }
		return null;
	}

}
