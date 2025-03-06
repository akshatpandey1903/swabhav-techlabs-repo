package com.aurionpro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.aurionpro.db.UserOperations;
import com.aurionpro.entity.User;

@WebServlet("/EditProfileController")
public class EditProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if (user == null || !user.getRole().equals("customer")) {
			response.sendRedirect("login.jsp");
			return;
		}

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		user.setEmail(email);
		user.setPassword(password);

		UserOperations userOps = new UserOperations();
		userOps.updateUser(user);

		session.setAttribute("user", user);
		response.sendRedirect("CustomerHomeController?page=editProfile&success=true");
	}
}


