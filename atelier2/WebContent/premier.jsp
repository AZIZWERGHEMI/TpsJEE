<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><% out.println(new java.util.Date()); %></h2>
<h2><%= new Date() %></h2>
<% for (int i=1; i<=5; i++) { %>
 <h<%=i %>> Titre de niveau :<%=i %> </h<%=i %>>
<% } %>
<table border="1">
<% for (int i=1; i<=4; i++) { %>
 <tr>
 <% for (int j=1; j<=3; j++) { %>
  <% int result = i * j; %>
  <%
   String color = (result % 2 == 0) ? "blue" : "red";
  %>
  <td style="color:<%=color%>;"><%=result%></td>
 <% } %>
 </tr>
<% } %>
</table>

</body>
</html>
