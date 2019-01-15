package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Produkt;
import  model.ProduktRepository;

@javax.servlet.annotation.WebServlet("/index")
public class IndexControl extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
//        ProduktRepository pr = new ProduktRepository();
        this.getServletContext().setAttribute("produkte",ProduktRepository.getAllItems());


        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/produktWahl.jsp");
        rd.forward(request,response);
    }

    protected void doPost (javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
        throws  javax.servlet.ServletException, IOException {

        String auswahl = request.getParameter("produktwahl");
        int auswahlToInt = Integer.parseInt(auswahl);

//        ProduktRepository pr = new ProduktRepository();
        List <Produkt> produkts = ProduktRepository.getAllItems();
        HttpSession session = request.getSession();


        for (Produkt produkt: produkts){
            if (auswahlToInt==produkt.getId()) {
                session.setAttribute("ProduktSession", produkt);
                break;
            }
        }

        response.getWriter().println(auswahl);
//        response.getWriter().println(produkts.get(auswahlToInt).getName());

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/bestellung.jsp");
        rd.forward(request,response);

    }
}
