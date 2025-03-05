package com.aurionpro.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 RequestDispatcher dispatcher = null;
		 String page = request.getParameter("page");
		 
	     if (page.equals("login")) {
	    	 dispatcher = request.getRequestDispatcher("/login.jsp");
	     } else if (page.equals("register")) {
	    	 dispatcher = request.getRequestDispatcher("/register.jsp");
	     } else if (page.equals("home")){
	    	 dispatcher = request.getRequestDispatcher("/index.jsp");
	     }
	     dispatcher.forward(request, response);
	     
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
