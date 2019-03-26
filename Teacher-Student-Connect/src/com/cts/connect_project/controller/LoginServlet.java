package com.cts.connect_project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.connect_project.bean.Login;
import com.cts.connect_project.bean.Register;
import com.cts.connect_project.service.LoginService;
import com.cts.connect_project.service.LoginServiceImpl;
import com.cts.connect_project.service.RegisterService;
import com.cts.connect_project.service.RegisterServiceImpl;
import com.cts.connect_project.service.ResourceService;
import com.cts.connect_project.service.ResourceServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	RequestDispatcher requestDispatcher = null;
	LoginService loginService = new LoginServiceImpl();
	ResourceService resourceService = new ResourceServiceImpl();
	RegisterService registerService = new RegisterServiceImpl();
	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * 
	 */
    
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		
		Login login = new Login();
		login.setUserId(userId);
		login.setPassword(password);
		
		if(loginService.authenticateUser(login)==1)
		{
			
			session.setAttribute("resources", resourceService.getAllResource());
			session.setAttribute("teachers", registerService.getAllTeachers());
			session.setAttribute("students", registerService.getAllStudents());
			
			requestDispatcher = request.getRequestDispatcher("p3.jsp");
			requestDispatcher.forward(request, response);
		}
		
		else
		{
			System.out.println("error");
			requestDispatcher = request.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(request, response);
		}
		
	}

}
