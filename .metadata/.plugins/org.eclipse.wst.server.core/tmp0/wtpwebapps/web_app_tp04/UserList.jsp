<%@page language="java" import="java.util.ArrayList, metier.User"%>
<%@include file="entete.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Consultation</title>
</head>
<div>
<body >
		<form method="get" action="/web_app_tp04/UserListController">
			<input name="filter"><br>
			<button type="submit">filtrer</button>
			<button type="reset">annuler</button>
		</form>
		Liste des utilisateurs
		<hr>
			<table border ="1">
			<tr>
				<th>Nom:</th>
				<th>Prenom:</th>
				<th>Login:</th>
				<th>Mot de passe:</th>
				<th colspan="2">Actions:</th>
				
			</tr>
		<%

			ArrayList users = (ArrayList) session.getAttribute("listOfUsers");
			if (users != null) {
				
				for (int i = 0; i < users.size(); i++) 
				{
					out.println("<tr>");
					out.println("<td> " + ((User) users.get(i)).getNom() + "</td>");
					out.println("<td> " + ((User) users.get(i)).getPrenom() + "</td>");
					out.println("<td> " + ((User) users.get(i)).getLogin() + "</td>");
					out.println("<td> " + ((User) users.get(i)).getPassword() + "</td>");
					out.print("<td>  <a href ='UserEditionController?id="+((User) users.get(i)).getId()+"&mode=Edition"+"'>Modifier</a> </td>");
					out.println("<td>  <a href ='UserEditionController?id="+((User) users.get(i)).getId()+"&mode=Suppression"+"'  onclick='return confirm(\"Voulez vous vraiment supprimer cet utilisateur ?\")'      >Supprimer</a> </td>");

					
					out.println("</tr>");
				}
				
			}
		%>
		
			
		</table>

<hr>
<a href ="UserForm.jsp">Ajouter</a>
</div>

</body>
</html>