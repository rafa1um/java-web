package br.com.movieloc.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.movieloc.jdbc.dao.MovieDao;
import br.com.movieloc.jdbc.modelo.Movie;

public class RemoveMovieLogic implements Logica{

	public String executa(HttpServletRequest req, HttpServletResponse res)
            throws Exception {

        String registry = req.getParameter("registry");

        Movie movie = new Movie();
        movie.setRegistry(registry);

        MovieDao dao = new MovieDao();
        dao.exclui(movie);

        System.out.println("Excluindo filme... ");

        return "list-movie.jsp";
    }

}
