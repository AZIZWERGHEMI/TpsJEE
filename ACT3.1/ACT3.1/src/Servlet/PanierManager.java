package Servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PanierManager
 */
@WebServlet("/PanierManager")
public class PanierManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PanierManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		HashMap<String,Integer>	a;
		if(session.getAttribute("panier")!=null)
			a=(HashMap<String,Integer>)session.getAttribute("panier");
		else
			a=new HashMap<String,Integer>();
		if(Integer.parseInt(request.getParameter("qte"))>0)
		{
			String ch=request.getParameter("prod");
			if(a.containsKey(ch))
				a.put(ch,a.get(ch)+Integer.parseInt(request.getParameter("qte")));
			else
				a.put(ch,Integer.parseInt(request.getParameter("qte")));
		}
		session.setAttribute("panier", a);
		response.sendRedirect("/ACT3.1/panier.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		HashMap<String,Integer> a=(HashMap<String,Integer>)session.getAttribute("panier");
		Map<String,String[]> map=request.getParameterMap();
		for(String key:map.keySet())
			a.remove(key);
		response.sendRedirect("/ACT3.1/panier.jsp");
	}

}
