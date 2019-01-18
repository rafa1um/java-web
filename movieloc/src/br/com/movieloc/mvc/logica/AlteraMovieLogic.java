package br.com.movieloc.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.movieloc.jdbc.dao.MovieDao;
import br.com.movieloc.jdbc.modelo.Movie;

public class AlteraMovieLogic implements Logica {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String registry = request.getParameter("registry");
		
		Movie movie = new Movie();
		
		movie.setNome(request.getParameter("nome"));
		movie.setRegistry(registry);
		movie.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		
		MovieDao dao = new MovieDao();
		dao.altera(movie);
		
		System.out.println("Livro atualizado...");
		return "mvc?logica=ListaMovieLogic";
	}

}
