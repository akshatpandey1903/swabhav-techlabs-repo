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
 * Servlet implementation class LastNameController
 */
@WebServlet("/LastNameController")
public class LastNameController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("Text/Html");
		PrintWriter writer = response.getWriter();
		
		String lastName = request.getParameter("lastName");
		Cookie cookie[] = request.getCookies();		
		String firstName = cookie[0].getValue();
		writer.print("Welcome "+ firstName + " " + lastName + "<br><br>");
		
		
		writer.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
