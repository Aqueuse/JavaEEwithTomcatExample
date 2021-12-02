import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(
  name = "RedirectServlet",
  description = "JSP Servlet With redirect",
  urlPatterns = {"/bleue", "/rouge"}
)
public class RedirectServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      if (request.getServletPath().equals("/bleue")) {
          request.setAttribute("color", "bleue");
          request.getRequestDispatcher("/JSP/bleue.jsp").forward(request, response);
      }
      if (request.getServletPath().equals("/rouge")) {
          request.setAttribute("color", "rouge");
          request.getRequestDispatcher("/JSP/rouge.jsp").forward(request, response);
      }
   }
}