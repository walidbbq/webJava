<%@ page import="model.Produkt" %><%--
  Created by IntelliJ IDEA.
  User: ghani
  Date: 14.01.2019
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored='false' %>
<html>
<head>
    <title>Bestellungen</title>
</head>


    <%
        Produkt s = (Produkt) request.getSession().getAttribute("ProduktSession");
        response.getWriter().print("<table><tr><td><h3> id </h3></td><td><h3> Produkt </h3></td><td><h3> Preis </h3></td></tr>");
        response.getWriter().print("<tr><td>" + s.getId() + "</td><td>" + s.getName() + "</td><td>" + s.getPreis() + "</td></tr></table>");
    %>

<%--${ProduktSession.name}--%>

<body>

</body>
</html>
