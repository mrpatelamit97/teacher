package com.cts.connect_project.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.cts.connect_project.bean.Help;

import com.cts.connect_project.service.HelpService;
import com.cts.connect_project.service.HelpServiceImpl;

/**
 * Servlet implementation class ResourceServlet
 */
public class HelpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	HelpService helpService = new HelpServiceImpl();

	public HelpServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
    
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String issue = request.getParameter("issue");
        String des = request.getParameter("desc");
        String email = request.getParameter("email");
        
        Help help = new Help();

        help.setIssue(issue);
        help.setDescription(des);
        help.setEmail(email);
 
        System.out.println(helpService.insertHelp(help));
        
   
	}

}
	

	
   