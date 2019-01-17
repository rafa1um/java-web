package br.com.movieloc.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AlteraLogic implements Logica{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String s_registry = request.getParameter("registry");
		
		request.setAttribute("registry", s_registry);
		return "WEB-INF/jsp/edit-movie.jsp";
	}

}
