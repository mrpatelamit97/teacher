package com.cts.connect_project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.connect_project.bean.Register;
import com.cts.connect_project.service.RegisterService;
import com.cts.connect_project.service.RegisterServiceImpl;


/**
* Servlet implementation class RegisterServlet
*/
public class RegisterServlet extends HttpServlet {
                private static final long serialVersionUID = 1L;
                RegisterService registerService = new RegisterServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

                /**
                * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
                */
                

                /**
                * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
                */
                protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                                String fname = request.getParameter("fname");
                                String lname = request.getParameter("lname");
                                String age = request.getParameter("age");
                                String gender = request.getParameter("gender");
                                String cno = request.getParameter("cno");
                                String cat = request.getParameter("cat");
                                String userid = request.getParameter("userid");
                                String password = request.getParameter("password");
                                System.out.println(request.getParameter("userid"));
                                
                                Register register = new Register();
                
                                register.setFname(fname);
                                register.setLname(lname);
                                register.setAge(age);
                                register.setGender(gender);
                                register.setCno(cno);
                                register.setCat(cat);
                                register.setUserid(userid); 
                                register.setPassword(password);
                                
                               
                                
                                boolean userRegistered = registerService.registerUser(register);
                                if(userRegistered)   //On success, you can display a message to user on Home page
                                {
                                                request.getRequestDispatcher("login.jsp").forward(request, response);
                                }
                                else   
                                {
                                                request.setAttribute("errMessage", userRegistered);
                                                request.getRequestDispatcher("index.jsp").include(request, response);
                                }
                }

                @Override
                protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                                
                                String userType=req.getParameter("userType");
                                
                                resp.sendRedirect("Register.jsp?userType="+userType);
                                                                
                }

}
