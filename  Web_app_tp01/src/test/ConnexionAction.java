package test;

import java.io.IOException;
import java.io.PrintWriter;

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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*String login = request.getParameter("login");
		String pass = request.getParameter("password");
		
		 PrintWriter out = response.getWriter();
		 out.println("login:"+login);
		 out.println("\n mot de passe:"+pass);
*/

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out = response.getWriter();
		//Récupérer la valeur du paramètre login"
		String l = request.getParameter("login");
		//Afficher la valeur du paramètre
		out.println(" <p>\n La valeur du nom est:\t"+l+"</p>");
		//Récupérer la valeur du paramètre password"
		String pwd = request.getParameter("password");
		//Afficher la valeur du paramètre
		out.println(" <p>\n La valeur du mot de passe est:\t"+pwd+"</p>");
		// validation
		if (l!=null && l.equals(""))
		{
		out.append("Champs login vide. Merci de spécifier une valeur..");
		}
		if (pwd!=null && pwd.equals(""))
		{
		out.append("Champs password vide. Merci de spécifier une valeur..");
		}
	}

}
