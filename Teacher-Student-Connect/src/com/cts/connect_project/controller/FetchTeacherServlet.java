package com.cts.connect_project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.connect_project.bean.Register;
import com.cts.connect_project.service.RegisterService;
import com.cts.connect_project.service.RegisterServiceImpl;

/**
 * Servlet implementation class FetchTeacherServlet
 */
public class FetchTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchTeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String id = request.getParameter("id");
		RequestDispatcher requestDispatcher = null;
		RegisterService registerService = new RegisterServiceImpl();
		Register register =  registerService.findTeacher(id);
		request.setAttribute("teacher", register);
		requestDispatcher = request.getRequestDispatcher("viewTeacher.jsp");
		
		requestDispatcher.forward(request, response);
		
		
	}


}
