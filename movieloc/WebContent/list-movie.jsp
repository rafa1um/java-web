<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, br.com.movieloc.jdbc.dao.*, br.com.movieloc.jdbc.modelo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movie Loc</title>
</head>
<body>
<table>
	<tr>
		<td>Nome</td>
		<td>Registro</td>
		<td>Quantidade</td>
	</tr>
   <%
       MovieDao dao = new MovieDao();
   	   List<Movie> movies = dao.getLista();

       for (Movie movie : movies) {
       %>
	       <tr>
	         <td><%=movie.getNome() %></td> 
	         <td><%=movie.getRegistry() %></td>
	         <td><%=movie.getQuantity() %></td>
	       </tr>
   <%
    }
   %>
</table>

</body>
</html>