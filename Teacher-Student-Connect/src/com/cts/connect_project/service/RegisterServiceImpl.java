package com.cts.connect_project.service;
import java.util.List;

import com.cts.connect_project.bean.Batch;
import com.cts.connect_project.bean.Register;
import com.cts.connect_project.dao.LoginDAO;
import com.cts.connect_project.dao.LoginDAOImpl;
import com.cts.connect_project.dao.RegisterDao;
import com.cts.connect_project.dao.RegisterDaoImpl;


public class RegisterServiceImpl implements RegisterService{
                           RegisterDao registerDAO = new RegisterDaoImpl();
                           LoginDAO loginDAO = new LoginDAOImpl();
                           
                            public boolean registerUser(Register register) {
                            	return registerDAO.registerUser(register);
                             
   
                           }

							@Override
							public List<Register> getAllTeachers() {
								// TODO Auto-generated method stub
								return registerDAO.getAllTeachers();
							}

							@Override
							public Register findTeacher(String userid) {
								// TODO Auto-generated method stub
								return registerDAO.findTeacher(userid);
							}
							
							@Override
							public List<Register> getAllStudents() {
								// TODO Auto-generated method stub
								return registerDAO.getAllStudents();
							}

							@Override
							public Register findStudent(String userid) {
								// TODO Auto-generated method stub
								return registerDAO.findStudent(userid);
							}

							@Override
							public Batch findBatch(String userid) {
								// TODO Auto-generated method stub
								return registerDAO.findBatch(userid);
							}
}
