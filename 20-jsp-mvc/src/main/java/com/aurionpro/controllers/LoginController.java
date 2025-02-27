package com.aurionpro.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = null;
		String loginType = request.getParameter("loginType");
		
		if(loginType.equalsIgnoreCase("customer"))
			dispatcher = request.getRequestDispatcher("/CustomerDashboard.jsp");
		if(loginType.equalsIgnoreCase("admin"))
			dispatcher = request.getRequestDispatcher("/AdminDashboard.jsp");
		
		request.setAttribute("name", "Akshat");
		dispatcher.forward(request, response);
		
		;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
