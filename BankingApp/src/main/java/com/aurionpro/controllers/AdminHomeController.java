package com.aurionpro.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AdminHomeController")
public class AdminHomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminHomeController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String role = (String) session.getAttribute("role");

		if (role == null || !role.equals("admin")) {
			response.sendRedirect("login.jsp");
			return;
		}

		String page = request.getParameter("page");
		RequestDispatcher dispatcher = null;

		if (page == null || page.equals("home")) {
			dispatcher = request.getRequestDispatcher("/adminHome.jsp");
		} else if (page.equals("addCustomer")) {
			dispatcher = request.getRequestDispatcher("/addCustomer.jsp");
		} else if (page.equals("addAccount")) {
			dispatcher = request.getRequestDispatcher("/addAccount.jsp");
		} else if (page.equals("viewCustomers")) {
			dispatcher = request.getRequestDispatcher("/viewCustomers.jsp");
		} else if (page.equals("viewTransactions")) {
			dispatcher = request.getRequestDispatcher("/viewTransactions.jsp");
		}

		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}


