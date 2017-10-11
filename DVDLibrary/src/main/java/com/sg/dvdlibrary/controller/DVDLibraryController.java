/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.controller;

import com.sg.dvdlibrary.dao.DVDLibraryDAO;
import com.sg.dvdlibrary.dto.DVD;
import com.sg.dvdlibrary.ui.DVDLibraryView;
import com.sg.dvdlibrary.ui.UserIO;
import com.sg.dvdlibrary.ui.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class DVDLibraryController {

    DVDLibraryView view;
    DVDLibraryDAO dao;
    private UserIO io = new UserIOConsoleImpl();
    
     public DVDLibraryController(DVDLibraryDAO dao, DVDLibraryView view){
        this.dao = dao;
        this.view = view;
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    listDVD();
                    break;
                case 2:
                    searchDVD();
                    break;
                case 3:
                    displayDVD();
                    break;
                case 4:
                    createDVD();
                    break;
                case 5:
                    removeDVD();
                    break;
                case 6:
                    editDVD();
                    break;
                case 7:
                    addEditDeleteDVD();
                    break;
                case 8:
                    loadDVD();
                    break;
                case 9:
                    saveDVD();
                    break;
                case 10:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }

        }
        exitMessage();
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    private void listDVD() {
        view.displayListAllBanner();
        List<DVD> DVDList = dao.getAllDVDs();
        view.displayDVDList(DVDList);
    }
    private void searchDVD() {
    view.displaySearchBanner();
    List<DVD> DvDList = dao.searchALLDVDs();
    view.displayDVDList(DVDList);
    }
    
    private void displayDVD() {
        view.displayDisplayAllBanner();
        List<DVD> DVDList = dao.getAllDVDs();
        view.displayDVDList(DVDList);
    }
    
      
        
    private void createDVD()  {
        view.displayCreateDVDBanner();
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD);
        view.displayDVDSuccessBanner();
    }
    
    private void removeDVD() {
        view.displayRemoveBanner();
        DVD oldDVD = view.getOldDVDInfo();
        dao.deleteDVD(oldDVD.getDVD(), oldDVD);
        view.displayRemoveSuccessBanner();
    } 
    
    private void editDVD() {
        view.displayEditBanner();
        DVD makeEdits = view.get
    
    }
  

    
    
    private void addEditDeleteDVD(){
        
        
    }
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

    public DVDLibraryController(DVDLibraryDAO dao, DVDLibraryView view) {
        this.dao = dao;
        this.view = view;
    } 
    
   
}

    

