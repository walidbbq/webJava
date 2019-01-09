package myservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test_input")

public class MyGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body><form action='auslesen' method='post'>");
		out.println("<Table>");
		out.println("<tr><td> Vorname:</td><td><input type='text' name='vname'></td></tr>");
		out.println("<tr><td> Nachname:</td><td><input type='text' name='nname'></td></tr>");
		out.println("<tr><td> <input type='submit' value='Daten absenden'></td></tr>");
		out.println("</table>");
		out.println("</body></form>");
		out.print("</html>");
	}

}
