<%--
  Created by IntelliJ IDEA.
  User: cs
  Date: 20.02.2020
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logowanie</title>
</head>
<body>
    <form action="/webapp/login" method="post">
        <input type="text" name = "login" placeholder="Wpisz login"/>
        <input type= "password" name="password" placeholder="Wpisz hasło"/>
        <input type="submit" value="Ok"/>
    </form>
</body>
</html>
