/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dto;

/**
 *
 * @author apprentice
 */
public class DVD {

    private String titleOfDVD;
    private String releaseDate;
    private String mpaaRatings;
    private String userRatings;
    private String directorName;
    private String studioName;

   

    public String getTitleOfDVD() {
        return titleOfDVD;
    }

    public void setTitleOfDVD(String titleOfDVD) {
        this.titleOfDVD = titleOfDVD;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMpaaRatings() {
        return mpaaRatings;
    }

    public void setMpaaRatings(String mpaaRatings) {
        this.mpaaRatings = mpaaRatings;
    }

    public String getUserRatings() {
        return userRatings;
    }

    public void setUserRatings(String userRatings) {
        this.userRatings = userRatings;
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
    
     public DVD(String titleOfDVD, String releaseDate, String mpaaRatings, String userRatings, String directorName, String studioName) {
        this.titleOfDVD = titleOfDVD;
        this.releaseDate = releaseDate;
        this.mpaaRatings = mpaaRatings;
        this.directorName = directorName;
        this.studioName = studioName;
    }

}
