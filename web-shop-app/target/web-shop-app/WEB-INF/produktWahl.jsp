<%--
  Created by IntelliJ IDEA.
  User: ghani
  Date: 14.01.2019
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored='false' %>

<html>
<head>
    <title>ProduktWahl</title>
</head>

<form  method="post">
    <table>
        <tr><td><h3>Produkt</h3></td><td><h3>Preis</h3></td></tr>
        <c:forEach var="produkt" items="${applicationScope.produkte}">
            <tr><td>${produkt.name}</td><td>${produkt.preis}</td> <td>
            <input type="radio" name="produktwahl" value="${produkt.id}">
        </td></tr>

        </c:forEach>
        <td><input type="submit" value="Bestellen"></input> </td>
    </table>
</form>




<body>

</body>
</html>
