package com.cts.connect_project.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.connect_project.bean.Resource;
import com.cts.connect_project.service.ResourceService;
import com.cts.connect_project.service.ResourceServiceImpl;

/**
 * Servlet implementation class ResourceServlet
 */
public class ResourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ResourceService resourceService = new ResourceServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResourceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		Resource resource = new Resource();
		String subject = request.getParameter("subject");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String year = request.getParameter("year");
		
		resource.setSubject(subject);
		resource.setTitle(title);
		resource.setAuthor(author);
		resource.setYear(year);
		
		if(resourceService.addResource(resource)==1)
		{
			request.getRequestDispatcher("submitResources.jsp").forward(request, response);
            request.setAttribute("addResourceMsg", "Resource Added");
            session.setAttribute("addResourceMsg", "Resource Added");

		}
		
		else
		{
			request.getRequestDispatcher("submitResources.jsp").forward(request, response);
            request.setAttribute("addResourceMsg", "Resource Not Added");
            session.setAttribute("addResourceMsg", "Resource Added");

		}
	}

}