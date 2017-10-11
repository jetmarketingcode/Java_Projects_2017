/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vm.ui;

import com.sg.vm.dto.Product;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class View {

    private final UserIO io;

    // public void displayMenuBanner() {
    // io.println("Main Menu\n Snickers 0.50\n Coke 0.75\n Reeses 0.90\n MilkyWay 0.50 ");
    // }
    public int buildDisplay(HashMap< String, Product> prod) {
        io.println("Main Menu");
        Set<String> keys = prod.keySet();
        int i = 0;
        for (String k : keys) {
            i++;
            Product p = prod.get(k);
            io.println("=================");
            io.println(i + " " + p.getItem() + " " + p.getPrice());

        }
        io.println("88  to make a cash deposit ");
        io.println("99 to exit");
        return i;
    }

    public int getCredit() {
        int credit = io.readInt("Please enter an amount you would like to deposit");
        return credit;
    }

    public int getMenuSelection() {
        int menuselection = io.readInt("Please enter your selection");
        return menuselection;

    }

    public void displayChangeDueBanner() {

    }

    public void displayChange(String change) {
        io.println(change);
        io.println(" ");

    }

    public void displayCreditBanner() {
        io.println("Thank you for your deposit");
    }

    public void displayExitBanner() {
        io.println("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.println("Unknown Command!!!");
    }

    public View(UserIO io) {
        this.io = io;
    }

    public void displayErrorMessage(String errorMsg) {
        io.println("=== ERROR ===");
        io.println(errorMsg);
    }

    public void printChange(String change) {

    }

    public int buildDisplay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
