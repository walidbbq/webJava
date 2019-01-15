<%--prefix:beliebiger Name auswählen // uri: uri aus TLD--%>
<%@taglib prefix="meinef" uri="AddFunction" %>
<%@ page isELIgnored="false" %>

<html>
<body>

<h2>Demo-ElFunktionBasic</h2>

<%--1-Name aus Direktiv (prefix) // 2- Methodename aus TLD --%>
4+3= ${meinef:funktionAdd(4,3)}




</body>
</html>
