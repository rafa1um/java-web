<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movie Loc</title>
</head>
<body>
<h1>DATABASE DE FILMES</h1>
	<form action="adicionaMovie" method="POST">
      Nome: <input type="text" name="nome" /><br />
      Registro: <input type="text" name="registry" /><br />
      Quantidade: <input type="number" name="quantity" min="1"/><br />
      <input type="submit" value="Save" />
      <input type="reset">
      <a href="index.jsp">Back</a>
     </form>
</body>
</html>