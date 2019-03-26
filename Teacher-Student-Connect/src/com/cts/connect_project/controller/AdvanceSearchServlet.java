package com.cts.connect_project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.connect_project.bean.Resource;
import com.cts.connect_project.service.RegisterService;
import com.cts.connect_project.service.RegisterServiceImpl;
import com.cts.connect_project.service.ResourceService;
import com.cts.connect_project.service.ResourceServiceImpl;

/**
 * Servlet implementation class AdvanceSearchServlet
 */
public class AdvanceSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ResourceService resourceService = new ResourceServiceImpl();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdvanceSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Resource resource = new Resource();
		HttpSession session = request.getSession();
		resource.setSubject(request.getParameter("subject"));
		resource.setAuthor(request.getParameter("author"));
		resource.setTitle(request.getParameter("title"));
		resource.setYear(request.getParameter("year"));
		
		//System.out.println(resource.toString());
		
		RequestDispatcher requestDispatcher = null;
	
		//request.setAttribute("resource", resourceService.searchDocuments(subject, title, author, year));
				session.setAttribute("resources", resourceService.searchResources(resource));
		requestDispatcher = request.getRequestDispatcher("documents.jsp");
		
		requestDispatcher.forward(request, response);
		
	}

}
