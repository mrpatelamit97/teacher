package com.cts.connect_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.connect_project.bean.Register;
import com.cts.connect_project.bean.Resource;
import com.cts.connect_project.util.DBUtils;

public class ResourceDAOImpl implements ResourceDAO {
	Resource resource = new Resource();
	private Connection con;
	@Override
	public int addResource(Resource resource) {
		 String subject=resource.getSubject();
         String title=resource.getTitle();
         String author=resource.getAuthor();
         String year=resource.getYear();
  
         
          PreparedStatement ps = null;
          try
          {
                 con = DBUtils.getConnection();
                 //String query = "insert into users(SlNo,fullName,Email,userName,password) values (NULL,?,?,?,?)"; //Insert user details into the table 'USERS'
                 String query = "insert into resources(subject,title,author,year) values (?,?,?,?)";
                   
           ps = con.prepareStatement(query); // generates sql query

        ps.setString(1, subject);
        ps.setString(2, title);
        ps.setString(3, author);
        ps.setString(4, year);

         
        int i= ps.executeUpdate();
                 if (i!=0)  //Just to ensure data has been inserted into the database
                 return 1; 
     
          }
          
          catch(SQLException e)
          {
                 e.printStackTrace();
                 return 0;
          }
		return 1;
	}
	
	
	@Override
	public List<Resource> getAllResource() {
		
		List<Resource> resources = new ArrayList<Resource>();
		PreparedStatement preparedStatement=null;
		String getString ="Select * from resources";
	
		ResultSet resultSet= null;
		Resource resource1 = null;
		
		try {
			con = DBUtils.getConnection();
			preparedStatement = con.prepareStatement(getString);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				
				String subject = resultSet.getString("subject");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				String year = resultSet.getString("year");
	
				resource1 = new Resource(subject,title,author,year);
				resources.add(resource1);
			}
			return resources;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtils.closeConnection(con);
		}
		
		return null;
		
	}


	@Override
	public List<Resource> filterResources(String query) {
		List<Resource> resources = new ArrayList<Resource>();
		PreparedStatement preparedStatement=null;
		String getString = query;
	
		ResultSet resultSet= null;
		Resource resource1 = null;
		
		try {
			con = DBUtils.getConnection();
			preparedStatement = con.prepareStatement(getString);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				
				String subject = resultSet.getString("subject");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				String year = resultSet.getString("year");
	
				resource1 = new Resource(subject,title,author,year);
				resources.add(resource1);
			}
			return resources;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtils.closeConnection(con);
		}
		
		return null;
	}


	@Override
	public Resource searchDocuments(String subject, String title, String author, String year) {
		Resource resource = null;
		PreparedStatement preparedStatement=null;
		String getString ="SELECT * FROM  resources WHERE subject like '%" +  subject +  "%' " +"OR  title like '%" +  title +"%' "+  "OR author like '%" +  year +"%' "+  "OR author like '%" +  year +"%' ";
		ResultSet resultSet= null;
		
		try {
			//System.out.println("inside dao");
			con= DBUtils.getConnection();
			preparedStatement = con.prepareStatement(getString);
			//preparedStatement.setString(1, userid1);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()){
				String subject1 = resultSet.getString("subject");
				String title1 = resultSet.getString("title");
				String author1 = resultSet.getString("author");
				String year1 = resultSet.getString("year");
				
				resource = new Resource(subject1,title1,author1,year1);
			}
			System.out.println(resource.toString());
			return resource;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtils.closeConnection(con);
		}
		
		
		return null;
	}
	
	
	@Override
	public List<Resource> searchResources(Resource resource) {
		List<Resource> resources = new ArrayList<Resource>();
		PreparedStatement preparedStatement=null;
		
		String subject = resource.getSubject().trim();
		String title = resource.getTitle().trim();
		String author = resource.getAuthor().trim();
		String year = resource.getYear().trim();
		int var = 0;
		
		String getString ="Select * from resources where";
		if(!subject.equals(""))
		{
			getString+="subject like '"+subject+"'";
			var=1;
		}
		if(!author.equals("")&&var==0)
		{
			getString+=" author like '"+author+"'";
			var=1;
		}
		else if(!author.equals(""))
		{
			getString+=" and author like '"+author+"'";
			var=1;
		}
		
		if(!title.equals("")&&var==0)
		{
			getString+=" title like '"+title+"'";
			var=1;
		}
		else if(!title.equals(""))
		{
			getString+=" and title like '"+title+"'";
			var=1;
		}
		
		if(!year.equals("")&&var==0)
		{
			getString+=" year like '"+year+"'";
		}
		else if(!year.equals(""))
		{
			getString+=" and year like '"+year+"'";
			var=1;
		}
		
		
		System.out.println(getString);
	//SELECT * FROM  resources WHERE subject like '%" +  subject +  "%' " +"OR  title like '%" +  title +"%' "+  "OR author like '%" +  year +"%' "+  "OR author like '%" +  year +"%' "
		ResultSet resultSet= null;
		Resource resource1 = null;
		
		try {
			con = DBUtils.getConnection();
			preparedStatement = con.prepareStatement(getString);
			
		
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				
				String subject1 = resultSet.getString("subject");
				String title1 = resultSet.getString("title");
				String author1 = resultSet.getString("author");
				String year1 = resultSet.getString("year");
	
				resource1 = new Resource(subject1,title1,author1,year1);
				resources.add(resource1);
			}
			System.out.println(resources.toString());
			return resources;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtils.closeConnection(con);
		}
		
		return null;
	}


}
