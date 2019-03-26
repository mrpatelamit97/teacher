package com.cts.connect_project.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.connect_project.bean.Resource;
import com.cts.connect_project.service.ResourceService;
import com.cts.connect_project.service.ResourceServiceImpl;

/**
 * Servlet implementation class SortDocumentsServlet
 */
public class SortDocumentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SortDocumentsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String query="";	
		String order=request.getParameter("order");
		
		//sort by author
		if(order.equals("AuthorAZ"))
		
		{
		query = "Select * from resources order by author";
		}
		else if(order.equals("AuthorZA"))
		{
		query = "Select * from resources order by author desc";
		}
		
		//sort by year
		else if(order.equals("YearNew"))
		{
		query = "Select * from resources order by year";
		}
		else if(order.equals("YearOld"))
		{
		query = "Select * from resources order by year desc";
		}
		
		//sort by title
		else if(order.equals("TitleAZ"))
		{
		query = "Select * from resources order by title";
		}
		
		else if(order.equals("TitleZA"))
		{
		query = "Select * from resources order by title desc";
		}
		
		//sort by subject
		else if(order.equals("SubjectAZ"))
		{
		query = "Select * from resources order by subject";
		}
		
		else
		{
		query = "Select * from resources order by subject desc";
		}
		
		
		
		
		ResourceService resourceService = new ResourceServiceImpl();
		List<Resource> resources = new ArrayList<Resource>();
		
		RequestDispatcher requestDispatcher = null;
		HttpSession session = request.getSession(true);
		
		resources.addAll(resourceService.filterResources(query));
		session.setAttribute("resources", resources);
		request.setAttribute("resources", resources);
		
		
		requestDispatcher = request.getRequestDispatcher("documents.jsp");
		requestDispatcher.forward(request, response);
	
	}

}