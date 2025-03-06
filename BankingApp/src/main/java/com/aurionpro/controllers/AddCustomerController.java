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

@WebServlet("/AddCustomerController")
public class AddCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if (username == null || email == null || password == null || username.isEmpty() || email.isEmpty() || password.isEmpty()) {
			request.setAttribute("error", "All fields are required!");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/addCustomer.jsp");
			dispatcher.forward(request, response);
			return;
		}

		User user = new User(username, password, email, "customer");
		UserOperations userOps = new UserOperations();

		if (userOps.addUser(user)) {
			request.setAttribute("success", "Customer Added Successfully!");
		} else {
			request.setAttribute("error", "Something went wrong!");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/addCustomer.jsp");
		dispatcher.forward(request, response);
	}
}


