package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class connexion1
 */
@WebServlet("/connexion1")
public class connexion1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  //  private static List<User> users = new ArrayList<>();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public connexion1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		String login = request.getParameter("login");
		String pass = request.getParameter("password");
		
		 PrintWriter out = response.getWriter();
		 out.println("<p>login:\t"+login+"</p>");
		 out.println(" <p>\n mot de passe:"+pass+"</p>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
	}

}
