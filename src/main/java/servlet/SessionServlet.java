package servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = {"/session", "/session/end"} )
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getRequestURI().endsWith("/end")){
            req.getSession().removeAttribute("counter");
            resp.getWriter().println("Koniec sesji");
            return;
        }
        HttpSession session = req.getSession();
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null){
            counter =  1;
        } else {
            counter++;
        }
        session.setAttribute("counter", counter);
        resp.getWriter().println("Owiedziłeś w czasie sesji stron: " + counter);
    }
}
