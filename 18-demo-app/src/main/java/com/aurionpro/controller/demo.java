package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/demo")
public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public demo() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String firstName = request.getParameter("firstNameTxt");
		String lastName = request.getParameter("lastNameTxt");
		String gender = request.getParameter("gender");
		String language = request.getParameter("language");
		String address = request.getParameter("address");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");
		String card = request.getParameter("creditCard");
		
		writer.print(
				"Name: " + firstName + " " + lastName + "<br><br>Gender: " + gender 
				+ "<br><br>Langauage: " + language + "<br><br>Address: " + address + "<br><br>State: "
				+ state + "<br><br>Zip: " + zip + "<br><br>Credit Card Type: " + card
				);
		
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
