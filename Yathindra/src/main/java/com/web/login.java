package com.web;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;



@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger loginLogger = 
			   Logger.getLogger(login.class);
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		try {
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			if(username.equals("yathindra") && password.equals("yathindra")) {
				
				HttpSession session=request.getSession();
				session.setAttribute("username", username);
				request.getRequestDispatcher("WEB-INF/success.jsp")
				.include(request,response);
			}else {
				request.getRequestDispatcher("WEB-INF/error.jsp")
										.include(request,response);
	}
		}catch(Exception e) {
			loginLogger.error("Unable to login", e);
			response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE,
									e.getMessage());
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
