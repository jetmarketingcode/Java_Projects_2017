/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.molibaug.ui;

import com.sg.molibaug.dto.Movie;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class View {

    private final UserIo io;

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
        String studioName = io.readString("Please enter the Studio Name");

        Movie currentMovie = new Movie();
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

        for (Movie currentMovie : movie) {
            io.print(
                    currentMovie.getUpcForMovie() + ": "
                    + currentMovie.getMovieTitle() + " "
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
        return io.readString("Please enter the UPC for the movie you would like to edit.");
    }

    public void displayMovie(Movie movie) {
        if (movie != null) {

            io.print(movie.getUpcForMovie() + " " + movie.getMovieTitle() +" " +movie.getReleaseDate() + " " + movie.getMpaaRating() + " " + movie.getUserRating() + " " + movie.getDirectorName() + " " + movie.getStudioName());

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

    public View(UserIo io) {
        this.io = io;
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }

    public int displayEditMovieChoiceList() {

        io.print("1. Movie title");
        io.print("2. Release date");
        io.print("3. Mpaa Rating");
        io.print("4. User Rating");
        io.print("5. Director Name");
        io.print("6. Studio Name");

        return io.readInt("What would you like to edit? ", 1, 6);
    }

    public void displayEditMovieChoice(int choice, Movie editChoice) {
        boolean keepRunning = true;
        while (keepRunning) {
            switch (choice) {
                case 1:
                    String title = io.readString("Please enter the changes for your movie Title");
                    editChoice.setMovieTitle(title);
                    keepRunning = false;
                    break;
                case 2:
                    String releaseDate = io.readString("Please enter 'new release date' you want to edit");
                    editChoice.setReleaseDate(releaseDate);
                    keepRunning = false;
                    break;
                case 3:
                    String mpaaRating = io.readString("Please enter new 'rating' you want to edit");
                    editChoice.setUserRating(mpaaRating);
                    keepRunning = false;
                    break;
                case 4:
                    String userRating = io.readString("Please enter new 'rating' you want to edit");
                    editChoice.setUserRating(userRating);
                    keepRunning = false;
                    break;
                case 5:
                    String directorName = io.readString("Please enter new 'director' you want to edit");
                    editChoice.setDirectorName(directorName);
                    keepRunning = false;
                    break;
                case 6:
                    String studioName = io.readString("Please enter new 'studio' you want to edit");
                    editChoice.setStudioName(studioName);
                    keepRunning = false;
                    break;
            }
        }

    }

}
