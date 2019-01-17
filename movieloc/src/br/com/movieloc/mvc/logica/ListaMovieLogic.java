package br.com.movieloc.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.movieloc.jdbc.dao.MovieDao;
import br.com.movieloc.jdbc.modelo.Movie;

public class ListaMovieLogic implements Logica {
	
	public String executa(HttpServletRequest req, HttpServletResponse res)
            throws Exception {

        List<Movie> movies = new MovieDao().getLista();

        req.setAttribute("movies", movies);

        return "/WEB-INF/jsp/list-movie.jsp";
    }
}
