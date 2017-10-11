/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bewarethekrakenloopsandifstatements;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BewareTheKrakenLoops {
    public static void main(String[] args) {
       Scanner inputReader = new Scanner(System.in);
       String stopOrGo;
        
        System.out.println("Already, get those flippers and wetsuits on, we are going diving");
        System.out.println("Here we gooooOOOOOooooo.....! Splash");
        
        int depthDivedInFeet = 0;
        
        while(depthDivedInFeet < 36000) {
            System.out.println("So far, we've swam " + depthDivedInFeet + " feet");
            
            if(depthDivedInFeet == 20000) {
                System.out.println("Uhh, I think I see a Kraken, guys.....");
                System.out.println("would you like to keep going? y/n");
                String keepGoing = inputReader.nextLine();
                if(keepGoing == "n") {
                    continue;
                }else {
                    break;
                }
            }
            depthDivedInFeet += 1000;
        }
        System.out.println(" ");
        System.out.println("We ended up swimming " + depthDivedInFeet + " feet down");
        System.out.println("I bet we can do better next time!!");
    }
    
            
}
