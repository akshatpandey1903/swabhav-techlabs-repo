package com.aurionpro.controllers;
import java.io.IOException;
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
import com.aurionpro.entity.User;

@WebServlet("/TransactionController")
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if (user == null || !user.getRole().equals("customer")) {
			response.sendRedirect("login.jsp");
			return;
		}

		String type = request.getParameter("type");
		String receiverId = request.getParameter("receiverId");
		double amount = Double.parseDouble(request.getParameter("amount"));
		String description = request.getParameter("description");

		AccountOperations accOps = new AccountOperations();
		Account senderAcc = accOps.getAccountByUserId(user.getUserId());

		if (senderAcc == null) {
			request.setAttribute("message", "No account found.");
			RequestDispatcher dispatcher = request.getRequestDispatcher("newTransaction.jsp");
			dispatcher.forward(request, response);
			return;
		}

		try {
			TransactionOperations transOps = new TransactionOperations();
			if (type.equals("deposit")) {
				transOps.deposit(senderAcc.getUserId(), amount, description);
			} else if (type.equals("withdraw")) {
				transOps.withdraw(senderAcc.getUserId(), amount, description);
			} else if (type.equals("transfer")) {
				if (receiverId == null || receiverId.isEmpty()) {
					request.setAttribute("message", "Receiver ID is required for transfer.");
					RequestDispatcher dispatcher = request.getRequestDispatcher("newTransaction.jsp");
					dispatcher.forward(request, response);
					return;
				}
				int receiverAccId = Integer.parseInt(receiverId);
				transOps.transfer(senderAcc.getUserId(), receiverAccId, amount, description);
			}

			response.sendRedirect("CustomerHomeController?page=viewPassbook");

		} catch (Exception e) {
			request.setAttribute("message", e.getMessage());
			RequestDispatcher dispatcher = request.getRequestDispatcher("newTransaction.jsp");
			dispatcher.forward(request, response);
		}
	}
}


