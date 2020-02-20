<%--
  Created by IntelliJ IDEA.
  User: cs
  Date: 20.02.2020
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kalkulator</title>
</head>
<body>
    <h1>Kalkulator</h1>
    <form method="get" action="/webapp/calc">
        <input type="number" name="a" />
        <input type = "number" name ="b"/>
        <input type="hidden" name="hidden" value="5"/>
        <select name = "op">
            <option value="add">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select>
        <input type="submit" value="Oblicz"/>
    </form>
</body>
</html>
