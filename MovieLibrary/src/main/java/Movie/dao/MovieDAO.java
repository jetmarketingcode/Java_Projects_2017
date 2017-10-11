/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie.dao;

import Movie.dto.Movie;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface MovieDAO {
    
    /**
     *
     * @param movieTitle
     * @param movie
     * @return
     * @throws MovieDAOException
     */
    Movie addMovie(String movieTitle, Movie movie)
	     throws MovieDAOException;
     
      List<Movie> getAllMovies()
	     throws MovieDAOException;

    /**
     *
     * @param movieTitle
     * @return
     * @throws MovieDAOException
     */
    Movie getMovie(String movieTitle)
	     throws MovieDAOException;
	    
    /**
     *
     * @param movieTitle
     * @return
     * @throws MovieDAOException
     */
    Movie removeMovie(String movieTitle)
	     throws MovieDAOException;
	
    /**
     *
     * @param movieTitle
     * @param movie
     * @return
     * @throws MovieDAOException
     */
    Movie editMovie(String movieTitle, Movie movie)
            throws MovieDAOException;
}