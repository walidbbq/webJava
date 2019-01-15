package myservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyPostServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String vorname = request.getParameter("vname");
        String nachname = request.getParameter("nname");

        request.getSession().setAttribute("vornameS",vorname);
        request.getSession().setAttribute("nachnameS",nachname);

        PrintWriter out1 = response.getWriter();
        out1.println("Hallo " + vorname + " " + nachname + " !");

        RequestDispatcher rd  = request.getRequestDispatcher("WEB-INF/ausgabe.jsp");
        rd.forward(request,response);



    }



}
