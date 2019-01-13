package br.com.movieloc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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

	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

			PrintWriter out = response.getWriter();
			
			String nome = request.getParameter("nome");
			

			Movie movie = new Movie();
			movie.setNome(nome);
		
		
			MovieDao dao = new MovieDao();
			dao.adiciona(movie);
			
			out.println("<html>");
			out.println("<body>");
			out.println("Movie " + movie.getNome() +
			    " adicionado com sucesso");
			out.println("</body>");
			out.println("</html>");
			}
}