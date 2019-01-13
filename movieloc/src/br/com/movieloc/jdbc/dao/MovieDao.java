package br.com.movieloc.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.movieloc.jdbc.ConnectionFactory;
import br.com.movieloc.jdbc.modelo.Movie;

public class MovieDao {

    private Connection connection;

    public MovieDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Movie movie) {
        String sql = "insert into movies " +
                "(nome,registry,quantity)" +
                " values (?,?,?)";

        try {
           
            PreparedStatement stmt = connection.prepareStatement(sql);

            
            stmt.setString(1,movie.getNome());
            stmt.setString(2,movie.getRegistry());
            stmt.setInt(3,movie.getQuantity());


            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void altera(Movie movie) {
        String sql = "update movies set nome=?, quantity=?,"+
                " where registry=?";

        try {
            PreparedStatement stmt = connection
                    .prepareStatement(sql);
            stmt.setString(1, movie.getNome());
            stmt.setString(2, movie.getRegistry());
            stmt.setInt(3, movie.getQuantity());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void remove(Movie movie) {
        try {
            PreparedStatement stmt = connection
                    .prepareStatement("delete from movies where registry=?");
            stmt.setString(1, movie.getRegistry());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Movie> getLista() {
    	
    	try {
            List<Movie> movies = new ArrayList<Movie>();
            PreparedStatement stmt = this.connection.
                    prepareStatement("select * from movies");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
               
                Movie movie = new Movie();
                movie.setNome(rs.getString("nome"));
                movie.setRegistry(rs.getString("registry"));
                movie.setQuantity(rs.getInt("quantity"));
                
               
                movies.add(movie);
            }
            rs.close();
            stmt.close();
            return movies;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
