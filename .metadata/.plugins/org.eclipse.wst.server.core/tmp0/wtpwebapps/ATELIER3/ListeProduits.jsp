<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="panier" method="POST">
<h1>Veiller choisir un produit </h1>
 <input type="radio" value="PC" name="produit"/> PC Portable<br>
  <input type="radio" value=imprimante name="produit"/> Imprimante <br>
  <input type="radio" value="scanner" name="produit"/>Scanner<br>
  	
  <input type="submit" value="choisir produit" />
  
 
 
</form>
</body>
</html>