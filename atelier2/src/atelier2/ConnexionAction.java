package atelier2;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConnexionAction
 */
@WebServlet("/ConnexionAction")
public class ConnexionAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnexionAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Récupération des paramètres du formulaire
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        
        // Traitement des paramètres (validation, etc.)
        // ...
        ArrayList<String> erreurs = new ArrayList<>();
        // Ajout des erreurs à l'ArrayList
        // ...
        
        // Passage des attributs à la page JSP
        request.setAttribute("login", login);
        request.setAttribute("password", password);
        request.setAttribute("erreurs", erreurs);
        
        // Redirection vers une autre page JSP
        request.getRequestDispatcher("connexion.jsp").forward(request, response);
    

	}

}
