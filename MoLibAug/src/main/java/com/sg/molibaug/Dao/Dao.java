/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.molibaug.Dao;

import com.sg.molibaug.dto.Movie;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface Dao {                                                                                              
    
    
    /**
     *
     * @param upcForMovie
     * @param movie
     * @return
     * @throws MovieDAOException
     */
    Movie addMovie(String upcForMovie, Movie movie)
	     throws DaoException;
     
      List<Movie> getAllMovies()
	     throws DaoException;

    /**
     *
     * @param upcForMovie
     * @return
     * @throws MovieDAOException
     */
    Movie getMovie(String upcForMovie)
	     throws DaoException;
	    
    /**
     *
     * @param upcForMovie
     * @return
     * @throws MovieDAOException
     */
    Movie removeMovie(String upcForMovie)
	     throws DaoException;
	
    /**
     *
     * @param upcForMovie
     * @param movie
     * @return
     * @throws MovieDAOException
     */
    Movie editMovie(String upcForMovie, Movie movie)
            throws DaoException;
}

