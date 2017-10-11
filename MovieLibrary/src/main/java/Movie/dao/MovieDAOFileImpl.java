/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie.dao;

import Movie.dto.Movie;
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
public class MovieDAOFileImpl implements MovieDAO {

    /**
     *
     */
    public static final String MOVIE_FILE = "Movie.txt";
    public static final String DELIMITER = "::";

    private void loadMovie() throws MovieDAOException {
        Scanner inputReader;

        try {

            inputReader = new Scanner(new BufferedReader(new FileReader(MOVIE_FILE)));
        } catch (FileNotFoundException e) {
            throw new MovieDAOException("-_- Could not load movie data into memory.", e);
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

            Movie currentMovie = new Movie(currentTokens[0]);

            currentMovie.setMovieTitle(currentTokens[0]);
            currentMovie.setReleaseDate(currentTokens[1]);
            currentMovie.setMpaaRating(currentTokens[2]);
            currentMovie.setUserRating(currentTokens[3]);
            currentMovie.setDirectorName(currentTokens[4]);
            currentMovie.setStudioName(currentTokens[5]);

            // Put currentMovie into the map using movieTitle as the key
            movies.put(currentMovie.getMovieTitle(), currentMovie);
        }
        // close scanner
        inputReader.close();
    }

    private void writeMovie() throws MovieDAOException {

        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(MOVIE_FILE));
        } catch (IOException e) {
            throw new MovieDAOException("Could not save movie data.", e);
        }

        List<Movie> movieList = this.getAllMovies();
        for (Movie currentMovie : movieList){
            out.println(currentMovie.getMovieTitle() + DELIMITER
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
    public Movie addMovie(String movieTitle, Movie movie)
            throws MovieDAOException {
        
       Movie newMovie = movies.put(movieTitle, movie);
        writeMovie();
        return newMovie;
    }

    /**
     *
     * @return
     * @throws MovieDAOException
     */
    @Override
    public List<Movie> getAllMovies()
            throws MovieDAOException {
        loadMovie();
        return new ArrayList<>(movies.values());

    }

    @Override
    public Movie getMovie(String movieTitle)
            throws MovieDAOException {
        loadMovie();
        return movies.get(movieTitle);
    }

    /**
     *
     * @param movieTitle
     * @return
     * @throws MovieDAOException
     */
    @Override
    public Movie removeMovie(String movieTitle)
            throws MovieDAOException {
        Movie removedMovie = movies.remove(movieTitle);
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
    public Movie editMovie(String movieTitle, Movie movie)
            throws MovieDAOException {
           Movie editedMovie = movies.put(movieTitle, movie);
           writeMovie();
           return editedMovie;
           
           
           
       
           
    }

}
