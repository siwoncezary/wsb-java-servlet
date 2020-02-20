package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("user") == null) {
            //forward do pliku login-form.jsp
            req.getRequestDispatcher("login-form.jsp").forward(req, resp);
        } else {
            resp.getWriter().println("Już się zalogowałeś ");
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if (login != null && password != null) {
            if (login.equals("adam") && password.equals("1234")) {
                resp.getWriter().println("Zostałeś zalogowany");
                req.getSession().setAttribute("user", "adam");
                return;
            } else {
                resp.getWriter().println("Błędne dane logowania!!!");
                return;
            }
        }
        req.getRequestDispatcher("login-form.jsp").forward(req, resp);
    }
}
