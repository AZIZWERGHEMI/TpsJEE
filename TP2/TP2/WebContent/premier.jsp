<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! int L,C; %>
	<form action="http://localhost:8000/TP2/myServlet" method="get">
		<label>Nombre de lignes :</label>
		<input name="ligne" type="number"><br>
		<label>Nombre de colonnes :</label>
		<input name="colonne" type="number"><br>
		<button>Envoyer</button>
	</form>
	<%
		if(request.getAttribute("ligne")!=null)
		{
			L=Integer.parseInt(request.getAttribute("ligne").toString());
			C=Integer.parseInt(request.getAttribute("colonne").toString());
		}
		else
		{
			L=0;
			C=0;
		}
	%>
	<table border= "1">
		 <%for (int i= 1; i<=L ; i++) {%>
			 <tr>
				 <%for (int j= 1; j<=C ; j++) {%>
				 	<td
				 		<%
				 			if((j*i)%2==0)
				 				out.print("style='color:blue'");
				 			else
				 				out.print("style='color:red'");
				 		%>	
				 	> 
				 		<%=i*j %>
				 	</td>
				 <%} %>
			 </tr>
		 <%} %>
	 </table>
</body>
</html>