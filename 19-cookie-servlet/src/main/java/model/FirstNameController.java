package model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstNameController
 */
@WebServlet("/FirstNameController")
public class FirstNameController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("Text/Html");
		PrintWriter writer = response.getWriter();
		
		String firstName = request.getParameter("firstName");
		Cookie cookie = new Cookie("firstName", firstName);
		
		response.addCookie(cookie);
		
		writer.print("Welcome " + firstName + "<br><br>");
		writer.print("<form action='LastNameController' method='post'>");
		writer.print("LastName: " );
		writer.print("<input type='text' name='lastName'><br><br>");
		writer.print("<button>Click</button>");
		writer.print("</form>");
		
		writer.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
