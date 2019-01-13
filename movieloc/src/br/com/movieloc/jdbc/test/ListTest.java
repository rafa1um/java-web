package br.com.movieloc.jdbc.test;

import java.util.List;

import br.com.movieloc.jdbc.dao.MovieDao;
import br.com.movieloc.jdbc.modelo.Movie;

public class ListTest {
	public static void main(String[] args) {
		MovieDao dao = new MovieDao();
		List<Movie> movies = dao.getLista();
		for (Movie movie : movies) {
	          System.out.println("Nome: " + movie.getNome());
	          System.out.println("Registro: " + movie.getRegistry());
	          System.out.println("Quantidade: " + movie.getQuantity());
	      }
	}
}
