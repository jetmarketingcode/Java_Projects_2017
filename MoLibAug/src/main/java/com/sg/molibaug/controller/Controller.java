/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.molibaug.controller;

import com.sg.molibaug.Dao.Dao;
import com.sg.molibaug.Dao.DaoException;
import com.sg.molibaug.dto.Movie;
import com.sg.molibaug.ui.UserIo;
import com.sg.molibaug.ui.UserIoConsoleImpl;
import com.sg.molibaug.ui.View;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class Controller {
    View view;
    Dao dao;
    private final UserIo io = new UserIoConsoleImpl();

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
        } catch (DaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void listMovies() throws DaoException {
        view.displayDisplayAllBanner();
        List<Movie> movieList = dao.getAllMovies();
        view.displayMovieList(movieList);
    }

    private void addMovie() throws DaoException {
        view.displayAddMovieBanner();
        Movie newMovie = view.getNewMovieInfo();
        dao.addMovie(newMovie.getUpcForMovie(), newMovie);
        view.displayAddMovieSuccessBanner();
    }

    private void viewMovie() throws DaoException {
        view.displayDisplayMovieBanner();
        String upcForMovie = view.getMovieTitleChoice();
        Movie movie = dao.getMovie(upcForMovie);
        view.displayMovie(movie);
    }

    private void removeMovie() throws DaoException {
        view.displayRemoveMovieBanner();
        String upcForMenu = view.getMovieTitleChoice();
        dao.removeMovie(upcForMenu);
        view.displayRemoveSuccessBanner();
    }

    private void editMovie() throws DaoException {
        view.displayEditMovieBanner();
        String upcForMovie = view.getMovieTitleChoice();
        Movie movie = dao.getMovie(upcForMovie);
       int choice = view.displayEditMovieChoiceList();
        view.displayEditMovieChoice(choice, movie);
        dao.editMovie(upcForMovie, movie); 
        
        view.displayEditSuccessBanner();
        
          
        
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

    public Controller(Dao dao, View view) {
        this.dao = dao;
        this.view = view;
    }

}

