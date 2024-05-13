<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel ="stylesheet" type ="text/css"
href="<%=request.getContextPath()%>/css/style.css"/>

</head>
<body>
 Première JSP
 
 <h2><% out.println (new Date()); %></h2>
 <h2><%= new Date() %></h2>
 
 
 <% for (int i=1; i<=5; i++) 
{ %> 
 <h<%=i %>> Titre de niveau :<%=i %> </h<%=i %>> 
<%} %>

<table border="1">
<% int L = 4; %>
<% for (int i = 1; i <= L; i++) { %>
    <tr>
    <% int C = 3; %>
    <% for (int j = 1; j <= C; j++) { %>
        <% int M = j * i; %>
        <% if (M % 2 == 0) { %>
            <td style="color:blue"><%= M %></td>
        <% } else { %>
            <td style="color:red"><%= M %></td>
        <% } %>
    <% } %>
    </tr>
<% } %>
</table>

 
 


</body>
</html>