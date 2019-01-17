<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movie Loc</title>
</head>
<body>
	<h1>DATABASE DE FILMES</h1>
          <table>
          <td>Nome: </td> <td>Registro: </td> <td>Quantidade: </td>
              <c:forEach var="movie" items="${movies}">
                  <tr>
                      <td>${movie.nome}</td>
                      <td>${movie.registry}</td>
                      <td>${movie.quantity}</td>
                      <td>
                      	<a href="mvc?logica=AlteraLogic&registry=${movie.registry}">Editar</a>
                      </td>
                      <td>
         			    <a href="mvc?logica=RemoveMovieLogic&registry=${movie.registry}">Remover</a>
       				  </td>
                  </tr>
              </c:forEach>
          </table>
          <br>
          <a href="index.jsp">Back</a>
</body>
</html>