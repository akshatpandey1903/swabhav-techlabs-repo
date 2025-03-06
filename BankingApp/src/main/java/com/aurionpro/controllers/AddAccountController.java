package com.aurionpro.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.aurionpro.db.AccountOperations;

@WebServlet("/AddAccountController")
public class AddAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userId = Integer.parseInt(request.getParameter("userId"));
		double balance = Double.parseDouble(request.getParameter("balance"));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/addAccount.jsp");

		try {
			AccountOperations accountOps = new AccountOperations();
			boolean isAdded = accountOps.addAccount(userId, balance);
			
			if (isAdded) {
				request.setAttribute("success", "Account Created Successfully!");
			} else {
				request.setAttribute("error", "Invalid Customer ID or Account Already Exists!");
			}
		} catch (Exception e) {
			request.setAttribute("error", "Something Went Wrong! Please Try Again.");
			e.printStackTrace();
		}

		dispatcher.forward(request, response);
	}
}


