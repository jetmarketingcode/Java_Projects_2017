
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.movielibrary;

import Movie.dao.MovieDAO;
import Movie.dao.MovieDAOFileImpl;
import Movie.ui.MovieUserIO;
import Movie.ui.MovieUserIOConsoleImpl;
import Movie.ui.MovieView;
import MovieController.MovieController;

/**
 *
 * @author apprentice
 */
public class MovieApp {
   
   public static void main(String[] args) {
    MovieUserIO myIO = new MovieUserIOConsoleImpl();
    MovieView myView = new MovieView(myIO);
    MovieDAO myDao = new MovieDAOFileImpl();
    MovieController controller = 
            new MovieController(myDao, myView);
                    
    controller.run();
}
}

