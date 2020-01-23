<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<HTML>

<BODY>

<c:forEach var = "joueur" items="${listJoueurs}">
    <TR>
        <TD>${joueur.prenom}</TD>  <TD>${joueur.nom}</TD><br>
    </TR>
</c:forEach>

</BODY>

</HTML>