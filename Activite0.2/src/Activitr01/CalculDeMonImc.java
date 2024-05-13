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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String tailleStr = request.getParameter("taille");
        String poidsStr = request.getParameter("poids");

        
        double taille = Double.parseDouble(tailleStr);
        double poids = Double.parseDouble(poidsStr);

      
        Imc imcCalculator = new Imc(taille, poids);

       
        double bmi = imcCalculator.calcul();

     
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Votre indice de masse corporelle (IMC) est : " + bmi + "</h2>");
        response.getWriter().println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        doGet(request, response);
    }
}

