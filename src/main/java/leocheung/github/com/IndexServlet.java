package leocheung.github.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String query = req.getParameter("name");
        if (query == null) {
            query = "servlet";
        }
        PrintWriter pw = resp.getWriter();
        pw.write("<h1>Hello, " + query + "!</h1>");
        pw.flush();
    }
}