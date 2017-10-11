/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.molibaug;

import com.sg.molibaug.Dao.Dao;
import com.sg.molibaug.Dao.DaoFileImpl;
import com.sg.molibaug.controller.Controller;
import com.sg.molibaug.ui.UserIo;
import com.sg.molibaug.ui.UserIoConsoleImpl;
import com.sg.molibaug.ui.View;

/**
 *
 * @author apprentice
 */

  

/**
 *
 * @author apprentice
 */
public class App {

    public static void main(String[] args) {
        UserIo myIo = new UserIoConsoleImpl();
        View myView = new View(myIo);
        Dao myDao = new DaoFileImpl();
        Controller controller = new Controller(myDao, myView);

        controller.run();
    }
}


