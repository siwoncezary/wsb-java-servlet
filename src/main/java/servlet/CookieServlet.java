package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//servelt obsługuje dwa endpointy
@WebServlet(value = {"/cookie","/cookie/color"})
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for(Cookie c : req.getCookies()){
            System.out.println(c.getName() + " " + c.getMaxAge() + " " + c.getValue());
        }
        //rozpoznajmey na podstawie URI, który z endpointów obsługujemy
        if (req.getRequestURI().endsWith("/color")){
            resp.addCookie(new Cookie("color", "#FF0"));
            resp.getWriter().println("Utworzono ciastko color");
        }
    }
}
