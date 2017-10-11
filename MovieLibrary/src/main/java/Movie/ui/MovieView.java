/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie.ui;

import Movie.dto.Movie;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class MovieView {
    
    private final MovieUserIO io;
    
    public int printMenuAndGetSelection() {
        io.print("Main Menu ");
        io.print("1. List Movie ");
        io.print("2. Add a New Movie ");
        io.print("3. View a Movie ");
        io.print("4. Remove a Movie ");
        io.print("5. Edit Movie ");
        io.print("6. Exit");
        
        return io.readInt("Please select from the above choices.", 1, 6);
    }
    
    public Movie getNewMovieInfo() {
        String movieTitle = io.readString("Please enter Movie");
        String releaseDate = io.readString("Please enter the release date");
        String mpaaRating = io.readString("Please enter Mpaa Rating");
        String userRating = io.readString("Please enter User Rating");
        String directorName = io.readString("Please enter the Directors Name");
        String studioName = io.readString("Plelase enter the Studio Name");
        
        Movie currentMovie = new Movie(movieTitle);
        currentMovie.setMovieTitle(movieTitle);
        currentMovie.setReleaseDate(releaseDate);
        currentMovie.setMpaaRating(mpaaRating);
        currentMovie.setUserRating(userRating);
        currentMovie.setDirectorName(directorName);
        currentMovie.setStudioName(studioName);
        return currentMovie;
        
    }
    
    public void displayAddMovieBanner() {
        io.print("==== Create Movie ===");
    }
    
    public void displayAddMovieSuccessBanner() {
        io.readString("Movie successfully created. Please hit enter to continue");
    }
    
    public void displayMovieList(List<Movie> movie) {
        
        
        for (Movie currentMovie: movie)  {
            io.print(
                    currentMovie.getMovieTitle() + ": "
                    + currentMovie.getReleaseDate() + " "
                    + currentMovie.getMpaaRating() + " "
                    + currentMovie.getUserRating() + " "
                    + currentMovie.getDirectorName() + " "
                    + currentMovie.getStudioName());
        }
        io.readString("Please hit enter to continue.");
    }
    
    public void displayDisplayAllBanner() {
        io.print("=== Display All Movies ===");
    }
    
    public void displayDisplayMovieBanner() {
        io.print("=== Display Movie ===");
    }
    
    public String getMovieTitleChoice() {
        return io.readString("Please enter the Movie Title.");
    }
    
    public void displayMovie(Movie movie) {
        if (movie != null) {
          
            io.print(movie.getMovieTitle() + " " + movie.getReleaseDate() + " " + movie.getMpaaRating() + " " + movie.getUserRating() + " " + movie.getDirectorName() + " " + movie.getStudioName());
            
            io.print("");
        } else {
            io.print("No such movie.");
        }
        io.readString("Please hit enter to continue.");
    }
    
    public void displayRemoveMovieBanner() {
        io.print("=== Remove Movie ===");
    }
    
    public void displayRemoveSuccessBanner() {
        io.readString("Movie successfully removed. Please hit enter to continue.");
    }
    
    public void displayEditMovieBanner() {
        io.print("===Edit Movie===");
    }
    
    public void displayEditSuccessBanner() {
        io.readString("Movie Successfully Edited. Please Hit enter to contine.");
    }
    
    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }
    
    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }
    
    public MovieView(MovieUserIO io) {
        this.io = io;
    }
    
    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
}
