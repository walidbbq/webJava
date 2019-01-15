package applisteners;

import model.Produkt;
import model.ProduktRepository;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

@WebListener()
public class AppStartStopListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public AppStartStopListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
       String user= sce.getServletContext().getInitParameter("user");
       String password= sce.getServletContext().getInitParameter("password");
       String url=sce.getServletContext().getInitParameter("url");
        System.out.println(url + " " + password + " " + user);
        Connection connection=null;
        try {
           Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(url,user,password);
            System.out.println("Web-shop-app to Databse connected!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.printf("ExeptionAusClassForName");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ExeptionAus.getConnection");
        }
        ProduktRepository.setCon(connection);
//        List<Produkt> list = ProduktRepository.getAllItems();
//        sce.getServletContext().setAttribute("liste",list);

//        System.out.println(list);



      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Connection Closed!");

        Connection con=null;
        ProduktRepository.setCon(con);
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attibute
         is replaced in a session.
      */
    }
}
