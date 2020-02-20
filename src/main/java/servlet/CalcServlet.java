package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/calc")
public class CalcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //odczyt parametrów z query
        String strA = req.getParameter("a");
        String strB = req.getParameter("b");
        String op = req.getParameter("op");
        System.err.println("Operator:" + op);
        if (strA != null && strB != null){
            try {
                double a = Double.parseDouble(strA);
                double b = Double.parseDouble(strB);
                double result = 0;
                switch(op){
                    case "add":
                        result = a + b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                    default:
                        resp.getWriter().println("Nie da się policzyć!!!");
                        return;
                }
                resp.getWriter().println("Wynik: " + result);
            } catch (NumberFormatException e) {
                resp.getWriter().println("Nie da się policzyć!!!");
            }
        }
    }
}
