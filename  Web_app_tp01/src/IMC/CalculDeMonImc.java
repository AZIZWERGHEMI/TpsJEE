package IMC;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculDeMonImc
 */
@WebServlet("/CalculDeMonImc")
public class CalculDeMonImc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculDeMonImc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		double taille =Double.parseDouble( request.getParameter("taille").toString()) ;
		double poids =Double.parseDouble( request.getParameter("poid").toString()) ;
		double imc = taille* poids;	

		
		 PrintWriter out = response.getWriter();
 
			out.println("le imc est :\t"+imc);		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		//float taille;
		//float poid;
		double taille =Double.parseDouble( request.getParameter("taille").toString()) ;
		double poids =Double.parseDouble( request.getParameter("poid").toString()) ;
		double imc = taille* poids;	
		//out.println("le poid est "+poid);
		out.println("\n la taille est :\t"+taille);
		out.println("\n la poid est :\t"+poids);
		
		out.println("le imc est :\t"+imc);		

		

	}

}
