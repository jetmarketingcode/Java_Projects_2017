/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.doitbetter;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DoItBetter {
    public static void main(String[] args){
        int hotDogs;
        int languagesKnown;
        int milesRan;
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("How many hotdogs can you eat?");
        hotDogs = inputReader.nextInt();
        System.out.println(" well I can eat " + (hotDogs * 2 + 1));
        
        System.out.println("How many languages do you know?");
        languagesKnown = inputReader.nextInt();
        System.out.println("Well I know " + (languagesKnown * 2 + 1));
        
        System.out.println("How many miles can you run? ");
        milesRan = inputReader.nextInt();
        System.out.println("Well I can run " + (milesRan * 2 + 1));
        
        
        
        
    }
    
}
