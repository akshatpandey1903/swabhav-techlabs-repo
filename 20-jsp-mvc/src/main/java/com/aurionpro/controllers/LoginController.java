package com.aurionpro.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.db.Logic;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Logic logic = new Logic();
		RequestDispatcher dispatcher = null;
		String loginType = request.getParameter("role");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		String role = logic.checkCredentials(username, password);
		if(role == null) {
			dispatcher = request.getRequestDispatcher("/Error.jsp");
			dispatcher.forward(request, response);
		}
		if(role.equalsIgnoreCase(loginType)) {
			if(role.equalsIgnoreCase("customer")) {
				dispatcher = request.getRequestDispatcher("/CustomerDashboard.jsp");
			} else if (role.equalsIgnoreCase("admin")) {
				dispatcher = request.getRequestDispatcher("/AdminDashboard.jsp");
			}
			dispatcher.forward(request, response);
		}
		dispatcher = request.getRequestDispatcher("/RoleError.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
