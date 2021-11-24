import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(
  name = "AdminServlet",
  description = "Admin page",
  urlPatterns = {"/admin"}
)
public class AdminServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String[] usernames = {"Aqueuse", "Dannou", "Charlotte"};
      request.setAttribute("usernames", usernames);
      request.getRequestDispatcher("/JSP/admin.jsp").forward(request, response);
   }
}