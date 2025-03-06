package com.aurionpro.controllers;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.db.UserOperations;
import com.aurionpro.entity.Account;
import com.aurionpro.entity.User;

@WebServlet("/ViewCustomersController")
public class ViewCustomersController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String role = (String) session.getAttribute("role");
		if (role == null || !role.equals("admin")) {
			response.sendRedirect("login.jsp");
			return;
		}

		String sort = request.getParameter("sort");
		String search = request.getParameter("search");

		UserOperations userOps = new UserOperations();
		List<User> customers;

		if (search != null && !search.isEmpty()) {
			customers = userOps.searchCustomers(search);
		} else if (sort != null && sort.equals("username")) {
			customers = userOps.getAllCustomersSortedByUsername();
		} else {
			customers = userOps.getAllCustomers();
		}
		
		Map<Integer, List<Account>> customerAccounts = new HashMap<>(); 	
		for (User customer : customers) { 		
			List<Account> accounts = userOps.getAccountsByUserId(customer.getUserId()); 		
			customerAccounts.put(customer.getUserId(), accounts); 	
		}
		
		request.setAttribute("customers", customers);
		request.setAttribute("customerAccounts", customerAccounts);
		request.setAttribute("search", search);
		request.setAttribute("sort", sort);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/viewCustomers.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}


