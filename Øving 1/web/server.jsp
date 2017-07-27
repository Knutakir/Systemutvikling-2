<%--
  Created by IntelliJ IDEA.
  User: Knut
  Date: 25.08.2016
  Time: 15.40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String brukernavn = request.getParameter("brukernavn");
    String passord = request.getParameter("passord");
    boolean loginOk = false;

    if (brukernavn != null && passord != null && brukernavn.equals("knut") && passord.equals("passord123")) {
        loginOk = true;
    }
%>

<html>
    <head>
        <title>serverjspshit</title>
    </head>
    <body>
    <% if(loginOk) {
            out.println("Du er logget inn");
            }%>
    </body>
</html>
