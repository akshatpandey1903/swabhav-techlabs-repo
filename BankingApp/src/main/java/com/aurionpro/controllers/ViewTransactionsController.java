package com.aurionpro.controllers;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.db.TransactionOperations;
import com.aurionpro.entity.Transaction;

@WebServlet("/ViewTransactionsController")
public class ViewTransactionsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String role = (String) session.getAttribute("role");
		if (role == null || !role.equals("admin")) {
			response.sendRedirect("login.jsp");
			return;
		}

		String type = request.getParameter("type");
		String sort = request.getParameter("sort");
		String order = request.getParameter("order");

		TransactionOperations transactionOps = new TransactionOperations();
		List<Transaction> transactions = transactionOps.getFilteredTransactions(type, sort, order);

		request.setAttribute("transactions", transactions);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/viewTransactions.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}


