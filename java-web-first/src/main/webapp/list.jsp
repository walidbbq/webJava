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
    PrintWriter out1 = response.getWriter();
    if (eingabe!=null) {
        if (!eingabe.equals("")){
            liste.add(eingabe);
        }
        for (String str : liste) {
            out1.println(str + "<br>");
        }

    }
%>
