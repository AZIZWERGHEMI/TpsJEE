package boutique;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class panier
 */
@WebServlet("/panier")
public class panier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public panier() {
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
		doGet(request, response);
	     HttpSession session = request.getSession();
	        String produit = request.getParameter("produit");
	        
	        // Obtenir ou initialiser la liste des produits dans la session
	        @SuppressWarnings("unchecked")
	        List<String> panier = (List<String>) session.getAttribute("panier");
	        if (panier == null) {
	            panier = new ArrayList<>();
	            session.setAttribute("panier", panier);
	        }
	        
	        // Ajouter le produit sélectionné au panier
	        panier.add(produit);
	        
	        // Rediriger vers la page d'affichage du panier
	        response.sendRedirect("Afficher.jsp");
	}

}
