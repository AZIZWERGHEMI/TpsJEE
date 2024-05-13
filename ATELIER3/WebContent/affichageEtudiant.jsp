<%@page import="Beans.Etudiant"%>
<%@ page language="java" contentType="text/html; charset=ISO8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Affichage des propriétés du bean </title>
</head>
<body>
<form action="EtudiantManager" methode="doGet">
<h1> Affichage des étudiants ( avec useBean)...</h1>

<jsp:useBean id="etdRequest" class="Beans.Etudiant" scope="request" />
 <%
 out.println("Etudiant (request)= "+etdRequest);
 %>
 <hr>
<jsp:useBean id="etdSession" class="Beans.Etudiant" scope="session" />
 <%
 out.println("Etudiant (session)= "+etdSession);
 %>
 <hr> 
<jsp:useBean id="etdApplication" class="Beans.Etudiant" scope="application" />
 <%
 out.println("Etudiant (application)= "+etdApplication);
 %>
 
 <div>
 <%
 Etudiant etd = (Etudiant) request.getAttribute("etudiant");
 out.println("Etudiant : "+etd);
 %>
 </div>
 
 
 <hr>
 </form>
</body>
</html>