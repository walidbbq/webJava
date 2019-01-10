<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.util.Arrays"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!static List<String> liste = new ArrayList<String>();%>

	<form action=list.jsp>
		<table>
			<tr>
				<td>Eingabe:</td>
				<td><input type="text" name="eingabe"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Daten Absenden"></td>
			</tr>
		</table>

	</form>
</body>
</html>
<%
	String eingabe = request.getParameter("eingabe");
	
	String leer ="";
	
	if (eingabe!=null) {
		if (!eingabe.equals("")){
			liste.add(eingabe);
		}
		for (String str : liste) {
			out.println(str + "<br>");
		}
		
	}
%>
