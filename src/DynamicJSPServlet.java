import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(
        name = "DynamicServlet",
        description = "JSP Servlet JSP loop",
        urlPatterns = {"/dynamic"}
)
public class DynamicJSPServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String[] usernames = {"Aqueuse", "Dannou", "Charlotte"};
        request.setAttribute("usernames", usernames);
        request.getRequestDispatcher("/JSP/dynamicLoop.jsp").forward(request, response);
    }
}