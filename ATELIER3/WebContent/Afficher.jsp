<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
<%@ page import="javax.servlet.http.HttpSession" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contenu du panier</title>
</head>
<body>
    <h1>Contenu de votre panier</h1>
    <%
        // Récupérer le contenu du panier depuis la session
        @SuppressWarnings("unchecked")
    List<String> panier = (List<String>) request.getSession().getAttribute("panier");
        
        if (panier != null && !panier.isEmpty()) {
    %>
            <ul>
            <% for (String produit : panier) { %>
                <li><%= produit %></li>
            <% } %>
            </ul>
    <%
        } else {
    %>
            <p>Votre panier est vide.</p>
    <%
        }
    %>
    <a href="ListeProduits.jsp">Ajouter un autre produit</a>
    <br>
    <a href="Deconnexion.jsp">Se déconnecter</a>
</body>
</html>
