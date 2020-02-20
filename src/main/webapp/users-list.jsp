<%--
  Created by IntelliJ IDEA.
  User: cs
  Date: 20.02.2020
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <th>Imię</th>
        </tr>
        <%
            String[] arr = (String[]) request.getAttribute("users");
            for(String item: arr){
        %>
        <tr><td>
            <%=item%>
        </td></tr>
        <%
            }
        %>
    </table>
</body>
</html>
