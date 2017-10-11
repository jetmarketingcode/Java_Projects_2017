/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary;

import com.sg.dvdlibrary.controller.DVDLibraryController;
import com.sg.dvdlibrary.dao.DVDLibraryDAO;
import com.sg.dvdlibrary.dao.DVDLibraryDAOFileImpl;
import com.sg.dvdlibrary.ui.DVDLibraryView;
import com.sg.dvdlibrary.ui.UserIO;
import com.sg.dvdlibrary.ui.UserIOConsoleImpl;


/**
 *
 * @author apprentice
 */
public class APP {
   public static void main(String[] args) 
   {
      UserIO myIo = new UserIOConsoleImpl();
      DVDLibraryView myView = new DVDLibraryView(myIo);
      DVDLibraryDAO myDao = new DVDLibraryDAOFileImpl();
      DVDLibraryController controller = new DVDLibraryController(myDao, myView);
      controller.run();
   } 
}
