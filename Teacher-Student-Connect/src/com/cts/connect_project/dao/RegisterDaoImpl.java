
package com.cts.connect_project.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.connect_project.bean.Batch;
import com.cts.connect_project.bean.Register;
import com.cts.connect_project.bean.Resource;
import com.cts.connect_project.util.DBUtils;
public class RegisterDaoImpl implements RegisterDao
{
	Connection con = null;
       @Override
       public boolean registerUser(Register register)
       {
             String fname=register.getFname();
             String lname=register.getLname();
             String age=register.getAge();
             String gender=register.getGender();
             String cno=register.getCno();
             String cat=register.getCat();
             String userid=register.getUserid();
             String password=register.getPassword();
             
             
              PreparedStatement ps = null;
              try
              {
                     con = DBUtils.getConnection();
                     //String query = "insert into users(SlNo,fullName,Email,userName,password) values (NULL,?,?,?,?)"; //Insert user details into the table 'USERS'
                     String query = "insert into user(fname,lname,age,gender,cno,cat,userid,password) values (?,?,?,?,?,?,?,?)";
                       
               ps = con.prepareStatement(query); // generates sql query

            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, age);
            ps.setString(4, gender);
            ps.setString(5, cno);
            ps.setString(6, cat);
            ps.setString(7, userid);
            ps.setString(8, password);
         
             
            int i= ps.executeUpdate();
                     if (i!=0)  //Just to ensure data has been inserted into the database
                     return true; 
         
              }
              
              catch(SQLException e)
              {
                     e.printStackTrace();
                     return false;
              }
			return false;
                
                     
       }
       
	@Override
	public List<Register> getAllTeachers() {
		List<Register> teacherList = new ArrayList<Register>();
		PreparedStatement preparedStatement=null;
		String getString ="Select * from user where cat = ? ";
	
		ResultSet resultSet= null;
		Register teachers = null;
		
		try {
			con = DBUtils.getConnection();
			preparedStatement = con.prepareStatement(getString);
			preparedStatement.setString(1, "Teacher");
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				
				String fname = resultSet.getString("fname");
				String userid = resultSet.getString("userid");
			    
			     String lname = null;
			     String age = null;
			     String gender= null;
			     String cno= null;
			     String cat= null;
			   String password = null;
	
			   teachers = new Register(fname,  lname,  age,  gender,  cno,  cat,  userid,
						 password);
				teacherList.add(teachers);
			}
			return teacherList;
			
			
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
	public Register findTeacher(String userid1) {
		Register register = null;
		PreparedStatement preparedStatement=null;
		String getString ="Select * from user where userid = ?";
		ResultSet resultSet= null;
		
		try {
			con= DBUtils.getConnection();
			preparedStatement = con.prepareStatement(getString);
			preparedStatement.setString(1, userid1);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()){
				
				String fname = resultSet.getString("fname");
				String age = resultSet.getString("age");
				String gender = resultSet.getString("gender");
				String cno = resultSet.getString("cno");
				String userid = resultSet.getString("userid");
				String lname = "null";
				String cat = "null";
				String password = "null";
				
				register = new Register( fname, lname, age, gender, cno, cat, userid,
						 password);
			}
			return register;
			
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
	public List<Register> getAllStudents() {
		List<Register> studentList = new ArrayList<Register>();
		PreparedStatement preparedStatement=null;
		String getString ="Select * from user where cat = ? ";
	
		ResultSet resultSet= null;
		Register students = null;
		
		try {
			con = DBUtils.getConnection();
			preparedStatement = con.prepareStatement(getString);
			preparedStatement.setString(1, "Student");
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				
				String fname = resultSet.getString("fname");
				String userid = resultSet.getString("userid");
			    
			     String lname = null;
			     String age = null;
			     String gender= null;
			     String cno= null;
			     String cat= null;
			   String password = null;
	
			   students = new Register(fname,  lname,  age,  gender,  cno,  cat,  userid,
						 password);
			   studentList.add(students);
			}
			return studentList;
			
			
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
	public Register findStudent(String userid1) {
		Register register = null;
		PreparedStatement preparedStatement=null;
		String getString ="Select * from user where userid = ?";
		ResultSet resultSet= null;
		
		try {
			con= DBUtils.getConnection();
			preparedStatement = con.prepareStatement(getString);
			preparedStatement.setString(1, userid1);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()){
				
				String fname = resultSet.getString("fname");
				String age = resultSet.getString("age");
				String gender = resultSet.getString("gender");
				String cno = resultSet.getString("cno");
				String userid = resultSet.getString("userid");
				String lname = "null";
				String cat = "null";
				String password = "null";
				
				register = new Register( fname, lname, age, gender, cno, cat, userid,
						 password);
			}
			return register;
			
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
	public Batch findBatch(String userid) {
		// TODO Auto-generated method stub
		Batch batch = null;
		PreparedStatement preparedStatement=null;
		String getString ="Select * from batch_details where userid = ?";
		ResultSet resultSet= null;
		
		try {
			con= DBUtils.getConnection();
			preparedStatement = con.prepareStatement(getString);
			preparedStatement.setString(1, userid);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()){
				
				String id = resultSet.getString("userid");
				String batchname = resultSet.getString("batch_name");
				String subject = resultSet.getString("subject");
				String slot = resultSet.getString("time_slot");
				batch = new Batch( id, batchname, subject, slot);
			}
			return batch;
			
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
