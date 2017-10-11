/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.ui;

import com.sg.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class DVDLibraryView {

    UserIO io;
    
    public DVDLibraryView(UserIO io){
       this.io = io;
       
    }
    
    public int printMenuAndGetSelection() {
        io.print("Main Menu ");
        io.print("1. List DVD's in Library ");
        io.print("2. Search DVD's by in Library by Title ");
        io.print("3. Display DVD Information ");
        io.print("4. Add a DVD to Library ");
        io.print("5. Remove a DVD from Library ");
        io.print("6. Edit a DVD Selection in Library ");
        io.print("7. Add/Delete/Edit Multiple DVD Selections ");
        io.print("8. Load DVD ");
        io.print("9. Save DVD ");
        io.print("10. Exit ");

        return io.readInt("Please select from the above choices.", 1, 10);
    }

    public DVD getNewDVDInfo() {
        String titleOfDVD = io.readString("Please enter the Title of your DVD");
        String releaseDate = io.readString("Please enter Release date or N/A");
        String mpaaRatings = io.readString("Please enter MPAA Rating of DVD or N/A");
        String userRatings = io.readString("Please enter User Rating of DVD, thumbs up or thumbs down, or N/A");
        String directorName = io.readString("please enter the Director's Name or N/A");
        String studioName = io.readString("Please enter the Studio's Name or N/A");
        DVD currentDVD = new DVD(titleOfDVD, releaseDate, mpaaRatings,  userRatings, directorName, studioName);
        currentDVD.setTitleOfDVD(titleOfDVD);
        currentDVD.setReleaseDate(releaseDate);
        currentDVD.setMpaaRatings(mpaaRatings);
        currentDVD.setUserRatings(userRatings);
        currentDVD.setDirectorName(directorName);
        currentDVD.setStudioName(studioName);
        return currentDVD;
        
       
        }
        public void displayCreateDVDBanner() {
	    io.print("=== Create DVD ===");
	}
    public void displayCreateSuccessAddDVDBanner() {
	    io.readString(
	            "DVD successfully created.  Please hit enter to continue");
	}
              
   public void displayDisplayAllBanner() {
        io.print("===Display All DVDs ===");
   }
   
    public void displayDisplayDVDBanner() {
    io.print("=== Display DVD ===");
    
    } 
    
    public String searchDVD() {
        return io. readString("please enter a title to searh for");     
    }
    
    public void displayDVD(DVD dvd){
        if (dvd != null) {
            io.print(dvd.getTitleOfDVD());
            io.print(dvd.getReleaseDate());
            io.print(dvd.getMpaaRatings());
            io.print(dvd.getUserRatings());
            io.print(dvd.getDirectorName());
            io.print(dvd.getStudioName());
            io.print("");
        }else {
      io.print("no such dvd");
        
        }
        io.readString("please hit enter to continue");
        }
    
    public void displayExitBanner() {
        io.print("Good Bye");
    }
    public void displayUnknownCommandBanner() {
        io.print("unknown command");
    }
     public void displayDVDList(List <DVD> DVDList){
            for (DVD currentDVD : DVDList){
            io.print(currentDVD.getTitleOfDVD() + " " + currentDVD.getReleaseDate() + " " + currentDVD.getMpaaRatings() + " " + currentDVD.getUserRatings() + " " + currentDVD.getDirectorName() + " " + currentDVD.getStudioName());
            io.readString("Please hit enter to continue.");
            }
    
    }
}