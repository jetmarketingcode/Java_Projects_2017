/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MovieController;

import Movie.dao.MovieDAO;
import Movie.dao.MovieDAOException;
import Movie.dto.Movie;
import Movie.ui.MovieUserIO;
import Movie.ui.MovieUserIOConsoleImpl;
import Movie.ui.MovieView;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class MovieController {

    MovieView view;
    MovieDAO dao;
    private final MovieUserIO io = new MovieUserIOConsoleImpl();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        listMovies();
                        break;
                    case 2:
                        addMovie();
                        break;
                    case 3:
                        viewMovie();
                        break;
                    case 4:
                        removeMovie();
                        break;
                    case 5:
                        editMovie();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            exitMessage();
        } catch (MovieDAOException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void listMovies() throws MovieDAOException {
        view.displayDisplayAllBanner();
        List<Movie> dvdList = dao.getAllMovies();
        view.displayMovieList(dvdList);
    }

    private void addMovie() throws MovieDAOException {
        view.displayAddMovieBanner();
        Movie newMovie = view.getNewMovieInfo();
        dao.addMovie(newMovie.getMovieTitle(), newMovie);
        view.displayAddMovieSuccessBanner();
    }

    private void viewMovie() throws MovieDAOException {
        view.displayDisplayMovieBanner();
        String movieTitle = view.getMovieTitleChoice();
        Movie movie = dao.getMovie(movieTitle);
        view.displayMovie(movie);
    }

    private void removeMovie() throws MovieDAOException {
        view.displayRemoveMovieBanner();
        String movieTitle = view.getMovieTitleChoice();
        dao.removeMovie(movieTitle);
        view.displayRemoveSuccessBanner();
    }

    private void editMovie() throws MovieDAOException {
        view.displayEditMovieBanner();
        String movieTitle = view.getMovieTitleChoice();
        Movie movie = dao.getMovie(movieTitle);
        view.displayMovie(movie);
        dao.removeMovie(movieTitle);
        Movie editMovie = view.getNewMovieInfo();
        
        dao.editMovie(editMovie.getMovieTitle(), editMovie);
        
        view.displayEditSuccessBanner();
        
            
        
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

    public MovieController(MovieDAO dao, MovieView view) {
        this.dao = dao;
        this.view = view;
    }

}
