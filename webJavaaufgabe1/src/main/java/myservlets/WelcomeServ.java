package myservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServ
 */
public class WelcomeServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List <String> colors = new ArrayList <String> ();
		
		
		colors.add("blau");
		colors.add("grün");
		colors.add("rot");
		colors.add("gelb");
		colors.add("orange");
		colors.add("violett");
		colors.add("türkis");
		
		
		request.setAttribute("farben", colors);
		
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
		
		
		
		
		
	}

}
