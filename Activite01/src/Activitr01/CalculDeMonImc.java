package Activitr01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculDeMonImc")
public class CalculDeMonImc extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CalculDeMonImc() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve parameters from the request
        String tailleStr = request.getParameter("taille");
        String poidsStr = request.getParameter("poids");

        // Convert parameters to numbers
        double taille = Double.parseDouble(tailleStr);
        double poids = Double.parseDouble(poidsStr);

        // Calculate BMI
        double bmi = poids / (taille * taille);

        // Send the response
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Votre indice de masse corporelle (IMC) est : " + bmi + "</h2>");
        response.getWriter().println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // For POST requests, let's redirect to the doGet method
        doGet(request, response);
    }
}
