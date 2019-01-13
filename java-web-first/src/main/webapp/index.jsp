<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.util.Arrays"%>
<%@ page isELIgnored="false" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<%--<%--%>
    <%--List <String> faColor = (List<String>) request.getAttribute("farben");--%>

    <%--PrintWriter out1 = response.getWriter();--%>
    <%--out1.println("<table>");--%>
    <%--for (String farbe : faColor){--%>
        <%--out1.println("<tr><td>"+ farbe +"</td></tr>");--%>
    <%--}--%>
    <%--out1.println("</table>");--%>
<%--%>--%>
<table>
    <tr><td> ${farben[0]}</td></tr>
    <tr><td> ${farben[1]}</td></tr>
    <tr><td> ${farben[2]}</td></tr>
    <tr><td> ${farben[3]}</td></tr>
    <tr><td> ${farben[4]}</td></tr>
    <tr><td> ${farben[5]}</td></tr>
    <tr><td> ${farben[6]}</td></tr>

</table>
</body>
</html>