package com.aurionpro.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aurionpro.db.UserOperations;
import com.aurionpro.entity.User;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String role = request.getParameter("role");

		RequestDispatcher dispatcher = null;

		if (username == null || email == null || password == null || role == null ||
			username.isEmpty() || email.isEmpty() || password.isEmpty()) {
			request.setAttribute("error", "All fields are required!");
			dispatcher = request.getRequestDispatcher("/register.jsp");
			dispatcher.forward(request, response);
			return;
		}

		User user = new User(username, password, email, role);
		UserOperations userOps = new UserOperations();
		boolean isRegistered = userOps.addUser(user);

		if (!isRegistered) {
			request.setAttribute("error", "User already exists!");
			dispatcher = request.getRequestDispatcher("/register.jsp");
			dispatcher.forward(request, response);
			
		}
		request.setAttribute("success", "Registration Successful! Please Login");
		dispatcher = request.getRequestDispatcher("/login.jsp");
		dispatcher.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}


