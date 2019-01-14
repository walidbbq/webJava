<%@ page import="java.io.PrintWriter" %><%--

  Created by IntelliJ IDEA.
  User: ghani
  Date: 13.01.2019
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>


<body>

<%
    PrintWriter pw = response.getWriter();
    pw.println ("<h4> >> Scriptlet </h4>\n");
    String vorname = (String)request.getSession().getAttribute("vornameS");
    String nachname = (String)request.getSession().getAttribute("nachnameS");
    pw.println(vorname);
    pw.println(nachname);
//    pw.println("aus ausgabe.jsp");
%>


<h4> >>Expresion </h4>
<%=vorname%>  <%=" " + nachname%>

<h4> >>Expresion Language</h4>

${vornameS} ${nachnameS}
</body>
</html>

