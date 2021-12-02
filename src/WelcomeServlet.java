import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet(
  name = "WelcomeServlet",
  description = "JSP Servlet With Annotations",
  urlPatterns = {"/"}
)
public class WelcomeServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      request.getRequestDispatcher("/index.jsp").forward(request, response);
   }
}