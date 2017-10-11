/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.molibaug.Dao;

import com.sg.molibaug.dto.Movie;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DaoFileImpl implements Dao {

    public static final String MOVIE_FILE = "Movie.txt";
    public static final String DELIMITER = "::";

    private void loadMovie() throws DaoException {
        Scanner inputReader;

        try {

            inputReader = new Scanner(new BufferedReader(new FileReader(MOVIE_FILE)));
        } catch (FileNotFoundException e) {
            throw new DaoException("-_- Could not load movie data into memory.", e);
        }

        String currentLine;

        String[] currentTokens;
        // Go through Movie_FILE line by line, decoding each line into a 
        // Process while we have more lines in the file
        while (inputReader.hasNextLine()) {
            // get the next line in the file
            currentLine = inputReader.nextLine();
            // break up the line into tokens
            currentTokens = currentLine.split(DELIMITER);

            Movie currentMovie = new Movie();
            currentMovie.setUpcForMovie(currentTokens[0]);
            currentMovie.setMovieTitle(currentTokens[1]);
            currentMovie.setReleaseDate(currentTokens[2]);
            currentMovie.setMpaaRating(currentTokens[3]);
            currentMovie.setUserRating(currentTokens[4]);
            currentMovie.setDirectorName(currentTokens[5]);
            currentMovie.setStudioName(currentTokens[6]);
           
            // Put currentMovie into the map using upcForMovie as the key
            movies.put(currentMovie.getUpcForMovie(), currentMovie);
        }
        // close scanner
        inputReader.close();
    }

    private void writeMovie() throws DaoException {

        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(MOVIE_FILE));
        } catch (IOException e) {
            throw new DaoException("Could not save movie data.", e);
        }

        List<Movie> movieList = this.getAllMovies();
        for (Movie currentMovie : movieList) {
            out.println(currentMovie.getUpcForMovie() + DELIMITER +
                    currentMovie.getMovieTitle() + DELIMITER
                    + currentMovie.getReleaseDate() + DELIMITER
                    + currentMovie.getMpaaRating() + DELIMITER
                    + currentMovie.getUserRating() + DELIMITER
                    + currentMovie.getDirectorName() + DELIMITER
                    + currentMovie.getStudioName());

            out.flush();
        }
        // Clean up
        out.close();
    }
    private final Map<String, Movie> movies = new HashMap<>();

    @Override
    public Movie addMovie(String upcForMovie, Movie movie)
            throws DaoException {
        loadMovie();
        Movie newMovie = movies.put(upcForMovie, movie);
        writeMovie();
        return newMovie;
    }

    /**
     *
     * @return @throws MovieDAOException
     */
    @Override
    public List<Movie> getAllMovies()
            throws DaoException {
        loadMovie();
        return new ArrayList<>(movies.values());

    }

    @Override
    public Movie getMovie(String upcForMovie)
            throws DaoException {
        loadMovie();
        return movies.get(upcForMovie);
    }

    /**
     *
     * @param movieTitle
     * @return
     * @throws MovieDAOException
     */
    @Override
    public Movie removeMovie(String upcForMovie)
            throws DaoException {
        loadMovie();
        Movie removedMovie = movies.remove(upcForMovie);
        writeMovie();
        return removedMovie;
    }

    /**
     *
     * @param movieTitle
     * @param movie
     * @return
     * @throws MovieDAOException
     */
    @Override
    public Movie editMovie(String upcForMovie, Movie movie)
            throws DaoException {

        Movie editMovie = movies.remove(movie);
        Movie editedMovie = movies.put(upcForMovie, movie);
        writeMovie();

        return editedMovie;

    }

    // @Override
    // public Movie editDvd(String movieTitle) 
    // throws MovieDAOException{    
    // loadMovie();
    //Movie editMovie = movies.remove(movieTitle);
    // writeMovie();
    // return editedMovie;         
}
