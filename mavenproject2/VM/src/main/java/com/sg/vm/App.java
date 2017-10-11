/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vm;

import com.sg.vm.controller.Controller;
import com.sg.vm.dao.AuditDao;
import com.sg.vm.dao.AuditDaoFileImpl;
import com.sg.vm.dao.Dao;
import com.sg.vm.dao.DaoFileImpl;
import com.sg.vm.service.InsufficientFundsException;
import com.sg.vm.service.ServiceLayer;
import com.sg.vm.service.ServiceLayerImpl;
import com.sg.vm.ui.UserIO;
import com.sg.vm.ui.UserIOConsoleImpl;
import com.sg.vm.ui.View;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args) throws InsufficientFundsException {
    UserIO myIo = new UserIOConsoleImpl();
    // Instantiate the View and wire the UserIO implementation into it
    View myView = new View(myIo);
    // Instantiate the DAO
    Dao myDao = new DaoFileImpl();
    // Instantiate the Audit DAO
    AuditDao myAuditDao = new AuditDaoFileImpl();
    // Instantiate the Service Layer and wire the DAO and Audit DAO into it
    ServiceLayer myService = new ServiceLayerImpl(myDao, myAuditDao);
    // Instantiate the Controller and wire the Service Layer into it
    Controller controller = new Controller(myService, myView);
    // Kick off the Controller
    controller.run();
    }
}
