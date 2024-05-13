<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
	import="beans.Produit"
	import="java.util.ArrayList"    
%>
<%
	ArrayList<Integer> panier;
	ArrayList<Produit> prod;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if(session.getAttribute("panier")!=null)
		{
			panier=(ArrayList<Integer>)session.getAttribute("panier");
			prod=(ArrayList<Produit>)session.getAttribute("prod");
			if(panier.size()!=0)
				for(int i:panier)
					out.println(prod.get(i).getName()+"<br>");
			else
				out.println("<h1>panier vide</h1>");
		}
		else
			out.println("<h1>panier vide</h1>");
	%>
	<a href="/ACT3/addProduit.html">add produit</a>
	<a href="/ACT3/ListeProduit.jsp">Liste Produit</a>
</body>
</html>