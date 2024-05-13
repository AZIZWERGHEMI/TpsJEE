package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class HelloWorldScope
 */
@WebServlet("/HelloWorldScope")
public class HelloWorldScope extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldScope() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType( "text/html" );
		//R�cup�rer l'objet d'�criture de la r�ponse
		PrintWriter out = response.getWriter();
		//R�cup�rer la valeur du param�tre prenom"
		String prenom = request.getParameter("prenom");
		//R�f�rencer � la session
		HttpSession session = request.getSession(true);
		//Placer la variable dans la session si elle est non nulle
		if (prenom !=null)
		session.setAttribute("prenom", prenom);
		//r�f�rencer au contexte (port�e application)
		ServletContext contexte = request.getServletContext();
		//Placer la variable dans le contexte si elle est non nulle
		if (prenom !=null) 
		contexte.setAttribute("prenom", prenom);
		//Paser � la page JSP "scope.jsp"
		request.getRequestDispatcher("scope.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
