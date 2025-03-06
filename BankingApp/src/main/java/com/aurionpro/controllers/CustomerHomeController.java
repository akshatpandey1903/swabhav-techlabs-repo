package com.aurionpro.controllers;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.db.AccountOperations;
import com.aurionpro.db.TransactionOperations;
import com.aurionpro.entity.Account;
import com.aurionpro.entity.Transaction;
import com.aurionpro.entity.User;

@WebServlet("/CustomerHomeController")
public class CustomerHomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String role = (String) session.getAttribute("role");

		if (role == null || !role.equals("customer")) {
			response.sendRedirect("login.jsp");
			return;
		}

		String page = request.getParameter("page");
		RequestDispatcher dispatcher = null;

		if (page == null || page.equals("home")) {
			dispatcher = request.getRequestDispatcher("/customerHome.jsp");
		} else if (page.equals("viewPassbook")) {
			
			User user = (User) session.getAttribute("user");
			AccountOperations accOps = new AccountOperations();
			TransactionOperations transOps = new TransactionOperations();

			Account account = accOps.getAccountByUserId(user.getUserId());
			if (account == null) {
				request.setAttribute("message", "You don't have an account. Please contact the bank.");
			} else {
				int accountNo = account.getUserId();
				List<Transaction> transactions = transOps.getTransactionsByAccountNo(accountNo);
				
				request.setAttribute("balance", account.getBalance());
				request.setAttribute("transactions", transactions);
				request.setAttribute("account", account);
			}

			dispatcher = request.getRequestDispatcher("/viewPassbook.jsp");
			
		} else if (page.equals("newTransaction")) {
			dispatcher = request.getRequestDispatcher("/newTransaction.jsp");
		} else if (page.equals("editProfile")) {
			dispatcher = request.getRequestDispatcher("/editProfile.jsp");
		}

		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}


