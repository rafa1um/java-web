
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movie Loc</title>
</head>
<body>
<h1>Movie Loc > Editar Filme</h1>
<form name="adicionaMovie" action="mvc">
<input type="hidden" name="logica" value="AlteraMovieLogic" />
<input type="hidden" name="registry" value="${registry}"/>
	
	Nome: <input type="text" name="nome" /><br>
	Quantidade:  <input type="number" name="quantity"  min="1" /><br>
	
	<input type="submit" value="Save"/>
	<input type="reset">
     <a href="index.jsp">Back</a>
	
</form>

</body>
</html>