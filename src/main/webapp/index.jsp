<%@page contentType="text/html; charset = UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<h2>Servlety z zajęć z dnia 20.02.2020</h2>
<ul>
    <li><a href="/webapp//hello">Servlet Hello</a> </li>
    <li><a href="/webapp/html">Servlet HTML</a></li>
    <li><a href="/webapp/calc?op=*&a=3&b=5">Servlet Calc</a></li>
    <li><a href="calc.jsp">Kalkulator</a></li>
    <h3>
    <%!
        double calc(double a, double b){
            return a + b;
        }
    %>
    <%
         String name = request.getParameter("name");
         out.println("Witaj "+ name);
         out.println(calc(4, 6));
    %>
    </h3>
    <p>Wynik obliczeń = <%=calc(5,6)%></p>
</ul>
</body>
</html>
