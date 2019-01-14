<%--
  Created by IntelliJ IDEA.
  User: ghani
  Date: 14.01.2019
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored='false' %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>


    <c:forEach var="el" items="${sessionScope.blumen}">
        <br>${el}
    </c:forEach>

    <c:if test="${blumen[0] eq 'Rosen'}"><br>Es handelt sich um Rosen</c:if>

    <c:choose>
        <c:when test="${blumen[0] eq 'Orchideen'}"><br>Es handelt sich um Orchideen</c:when>
        <c:otherwise> <br>Es handelt sich nicht um Orchideen</c:otherwise>
    </c:choose>
</head>
<body>

</body>
</html>
