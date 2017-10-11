/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.birthstones;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BirthStones {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int userChoice = 0;
        
        System.out.println("Please enter a number for a month you would like to know what the birth stone is for that month, 1-12.");
        String month = inputReader.nextLine();
        userChoice = Integer.parseInt(month);
        
        if (userChoice == 1) {
            System.out.println("January's birth stone is Garnet");
        }else if (userChoice == 2) {
            System.out.println("February's birth stone is Amethyst");
        }else if (userChoice ==3) {
            System.out.println("March's birth stone is Aquamarine");
        }else if (userChoice == 4) {
            System.out.println("April's birth stone is Diamond");
        }else if (userChoice == 5) {
            System.out.println("May's birth stone is Emerald");
        }else if (userChoice == 6) {
            System.out.println("June's birth stone is Pearl");
        }else if (userChoice == 7) {
            System.out.println("July's birth stone is Ruby");
        }else if (userChoice == 8) {
            System.out.println("August's birth stone is Peridot");
        }else if (userChoice == 9) {
            System.out.println("September's birth stone is Sapphire");
        }else if (userChoice == 10) {
            System.out.println("October's birth stone is Opal");
        }else if (userChoice == 11) {
            System.out.println("November's birth stone is Topaz");
        }else if (userChoice == 12) {
            System.out.println("December's birth stone is Turquoise");
        }else {
            System.out.println("Error, try again at a later time!");
        }
    }
}
