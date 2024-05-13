<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %> <!-- Ajoutez cette ligne pour importer ArrayList -->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Connexion</title>
<link rel ="stylesheet" type ="text/css" href="<%=request.getContextPath()%>/css/style.css"/>
</head>
<body>
<div>
Veuillez saisir vos paramètres de connexion :
</div>
<div>
<form action="ConnexionAction" method="POST">
<table>
<tr>
<td class ="label">Nom:</td>
<td><input type="text" name="login" value =""/></td></tr>
<tr>
<td class ="label">Mot de passe:</td>
<td>
<input type="password" name="password" value ="" />
</td></tr>
<tr>
<td align="center" colspan="2">
<input type="submit" value="ok " />
<input type="reset" value="Annuler" />
</td></tr>
</table>
</form>
</div>
<div>
<%
ArrayList<String> erreurs = (ArrayList<String>)request.getAttribute("erreurs");
if (erreurs != null && !erreurs.isEmpty()) {
    for (String erreur : erreurs) {
%>
    <p><%= erreur %></p>
<%
    }
}
%>
</div>
</body>
</html>
