package br.com.movieloc.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.movieloc.jdbc.dao.MovieDao;
import br.com.movieloc.jdbc.modelo.Movie;


@WebServlet("/adicionaMovie")
public class AdicionaMovieServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AdicionaMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

			String nome = request.getParameter("nome");
			String registry = request.getParameter("registry");
			int int_quantity = Integer.parseInt(request.getParameter("quantity"));
			

			Movie movie = new Movie();
			movie.setNome(nome);
			movie.setRegistry(registry);
			movie.setQuantity(int_quantity);
		
		
			MovieDao dao = new MovieDao();
			dao.adiciona(movie);
			
			RequestDispatcher rd = request
	                 .getRequestDispatcher("/movie-added.jsp");
	         rd.forward(request,response);
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}