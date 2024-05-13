<%@page import="beans.Produit" import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		ArrayList<Produit> listProd;
		ArrayList<Integer> panier;
	%>
	<%
		if(session.getAttribute("prod")!=null)
		{
			listProd=(ArrayList<Produit>)session.getAttribute("prod");
			if(session.getAttribute("panier")!=null)
				panier=(ArrayList<Integer>)session.getAttribute("panier");
			else
				panier=new ArrayList<Integer>();
	%>
	<form action="/ACT3/panierManager" method="get">
	<%
		for(int i=0;i<listProd.size();i++)
			{
	%>
	<input type="checkbox" <% if(panier.contains(i)) out.print("checked"); %> name=<%="p"+i %>>
	<%=listProd.get(i).getName() %><br>
	<%} %>
	<button type="submit">Ajouter</button>
	<button type="reset">Annuler</button>
	</form>
	<%} 
	else
		out.println("<h1>mathamech produit</h1>");
	%>
	<a href="/ACT3/addProduit.html">add produit</a>
	<a href="/ACT3/panierManager">panier</a>
</body>
</html>