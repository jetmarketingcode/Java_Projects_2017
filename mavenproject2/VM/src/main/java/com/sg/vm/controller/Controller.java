/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vm.controller;

import com.sg.vm.dao.PersistenceException;
import com.sg.vm.service.InsufficientFundsException;
import com.sg.vm.service.OutOfInventoryException;
import com.sg.vm.service.ServiceLayer;
import com.sg.vm.ui.UserIO;
import com.sg.vm.ui.UserIOConsoleImpl;
import com.sg.vm.ui.View;
import java.util.HashMap;

/**
 *
 * @author apprentice
 */
public class Controller {
     private final View view;
    private final ServiceLayer service;
  private UserIO io = new UserIOConsoleImpl();
    
    
   

    public void run() throws InsufficientFundsException {
        boolean keepGoing = true;
        HashMap menuSelection;
        try {
            while (keepGoing) {

                menuSelection = service.getInventoryHash();//just the object hash
               
                int productCount = view.buildDisplay(menuSelection);

                int selection = getMenuSelection();

                switch (selection) {
                    case 88:
                        getCredit();
                        break;

                    case 99:
                        exitMessage();
                        keepGoing = false;
                        break;
                    default:
                        //
                        if (productCount < 1 || selection > productCount) {
                            unknownCommand();
                            break;

                        }
                         {
                            try {
                                String s = service.vend(selection);
                            } catch (OutOfInventoryException e) {
                                view.displayErrorMessage(e.getMessage());
                            }
                        }
                }

            }
            exitMessage();
        } catch (PersistenceException e) {
            view.displayErrorMessage(e.getMessage());
        }

    }

    private int getMenuSelection() throws PersistenceException {
        int menuSelection = view.getMenuSelection();
        view.getMenuSelection();
        return menuSelection;
    }

    private void getCredit() throws PersistenceException {
        view.displayCreditBanner();
        int credit = view.getCredit();

    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

   public Controller(ServiceLayer service, View view) {
        this.service = service;
        this.view = view;
        
    }
    
}
