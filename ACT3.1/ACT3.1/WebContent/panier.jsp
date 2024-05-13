<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
	import="java.util.HashMap"
	import="java.util.Map.Entry"
%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		HashMap<String,Integer> a;
	%>
	<form method="get" action="/ACT3.1/PanierManager">
		<label>Produit :</label>
		<select name="prod">
			<option>Pc_Portable</option>
			<option>Scanner</option>
			<option>Clavier</option>
		</select>
		<label>Qte :</label>
		<input type="number" name="qte"><br>
		<button>Ajouter</button>
		
	</form>
	<table border=1>
		<tr>
			<td>Produit</td>
			<td>Quantite</td>
			<td>Act</td>
			<%
				if(session.getAttribute("panier")!=null)
				{
					HashMap<String,Integer>	a=(HashMap<String,Integer>)session.getAttribute("panier");
					for(Entry<String,Integer> i:a.entrySet())
						out.print("<tr><td>"+i.getKey()+"</td><td>"+i.getValue()+"</td><td><form method=post action=/ACT3.1/PanierManager><button type=submit name="+i.getKey()+">supprimer</button></form></td></tr>");
				}
			%>
		</tr>
	</table>
</body>
</html>