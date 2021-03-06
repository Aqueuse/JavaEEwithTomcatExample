import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(
  name = "RequestExampleServlet",
  description = "JSP Servlet With Get and Post",
  urlPatterns = {"/message"}
)
public class RequestExampleServlet extends HttpServlet {
  LogToCmd logToCmd = new LogToCmd(); // because the Tomcat logger is so bad !
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.setAttribute("text", request.getParameter("message"));
        request.getRequestDispatcher("/JSP/requestMe.jsp").forward(request, response);
   }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String nom = request.getParameter("NOM");
        String prenom = request.getParameter("PRENOM");

        logToCmd.logInTerm("prenom : "+prenom+" nom : "+nom);
    }
}