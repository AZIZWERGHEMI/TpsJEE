

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Produit;

/**
 * Servlet implementation class produitManager
 */
@WebServlet("/produitManager")
public class produitManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public produitManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		ArrayList<Produit> listProd;
		if(session.getAttribute("prod")!=null)
			listProd=(ArrayList<Produit>)session.getAttribute("prod");
		else
			listProd=new ArrayList<Produit>();
		Produit prod=new Produit();
		prod.setName(request.getParameter("prod").toString());
		listProd.add(prod);
		session.setAttribute("prod", listProd);
		response.sendRedirect("/ACT3/ListeProduit.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
