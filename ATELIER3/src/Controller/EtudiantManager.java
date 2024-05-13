package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.Etudiant;

/**
 * Servlet implementation class EtudiantManager
 */
@WebServlet("/EtudiantManager")
public class EtudiantManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EtudiantManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Servlet: EtudiantManager..");

		Etudiant e = new Etudiant();
		e.setNom("Ayyadi");
		e.setPrenom("Slim");
		e.setNumero(1);
		request.setAttribute("etudiant", e);
		
		 
		//this.getServletContext().getRequestDispatcher("/affichageEtudiant.jsp").forward(request, 
		//response);
		//System.out.println("Servlet: EtudiantManager..");
// création d'un bean Etudiant e
		Etudiant e1 = new Etudiant();
		e1.setNom("Ayyadi");
		e1.setPrenom("Slim");
		e1.setNumero(1);
		request.setAttribute("etdRequest", e1);


		Etudiant e2 = new Etudiant();
			e2.setNom("Ben Omar");
			e2.setPrenom("Ali");
			e2.setNumero(2);
		HttpSession session = request.getSession(true);
		session.setAttribute("etdSession", e2);
		
		Etudiant e3 = new Etudiant();
			e3.setNom("Tounsi");
			e3.setPrenom("Samira");
			e3.setNumero(3);
		this.getServletContext().setAttribute("etdApplication", e3);
		

		this.getServletContext().getRequestDispatcher("/affichageEtudiant.jsp").forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
