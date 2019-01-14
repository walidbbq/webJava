<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.util.Arrays"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List <String> faColor = (List<String>) request.getAttribute("farben");

out.println("<table>");
for (String farbe : faColor){
	out.println("<tr><td>"+ farbe +"</td></tr>");
}
out.println("</table>");
%>
</body>
</html>