package br.com.movieloc.jdbc.test;

import br.com.movieloc.jdbc.dao.MovieDao;
import br.com.movieloc.jdbc.modelo.Movie;

public class InsertTest {
	
	public static void main(String[] args) {
		Movie movie = new Movie();
	    
	    movie.setNome("Léon: The Professional");
	    movie.setRegistry("22ab");
	    movie.setQuantity(2);

	    MovieDao dao = new MovieDao();

	    dao.adiciona(movie);

	    System.out.println("Gravado!");
	}

}
