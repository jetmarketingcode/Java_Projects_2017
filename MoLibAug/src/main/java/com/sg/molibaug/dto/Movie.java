/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.molibaug.dto;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class Movie {

    String upcForMovie;
    String movieTitle;
    String releaseDate;
    String mpaaRating;
    String userRating;
    String directorName;
    String studioName;

    public Movie() {
        Random random = new Random();

        this.upcForMovie = Integer.toString(random.nextInt(9999999));
    }

    public String getUpcForMovie() {
        return upcForMovie;

    }

    public void setUpcForMovie(String upcForMovie) {
        this.upcForMovie = upcForMovie;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public String getUserRating() {
        return userRating;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

}
