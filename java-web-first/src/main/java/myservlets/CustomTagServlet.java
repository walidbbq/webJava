package myservlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/CustomTagServlet")
public class CustomTagServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<String> liste= new ArrayList<String>();
        liste.add("Rosen");
        liste.add("Tulpen");
        liste.add("Narzissen");
        liste.add("Chrysantheme");
        liste.add("Orchideen");

        request.getSession().setAttribute("blumen",liste);

        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/customTag.jsp");
        rd.forward(request,response);

    }
}
