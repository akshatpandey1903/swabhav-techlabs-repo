package com.aurionpro.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.db.UserOperations;
import com.aurionpro.entity.User;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = request.getParameter("role");

		RequestDispatcher dispatcher = null;

		if (username == null || password == null || role == null || username.isEmpty() || password.isEmpty()) {
			request.setAttribute("error", "All Fields are Required!");
			dispatcher = request.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
			return;
		}

		UserOperations userOps = new UserOperations();
		User user = userOps.authenticateUser(username, password, role);

		if (user == null) {
			request.setAttribute("error", "Invalid Credentials!");
			dispatcher = request.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		session.setAttribute("role", user.getRole());

		if (user.getRole().equals("admin")) {
			dispatcher = request.getRequestDispatcher("/adminHome.jsp");
		} else if (user.getRole().equals("customer")) {
			dispatcher = request.getRequestDispatcher("/customerHome.jsp");
		}
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}



