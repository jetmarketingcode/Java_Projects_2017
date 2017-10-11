/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.lovemedowhileloops;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class RandomLovesMe {
    public static void main(String[] args) {
        
        Random rGen = new Random();
       int loopCounter = rGen.nextInt(89) + 13;
      
        String love = "It loves me Not!\n It loves Me!!";
        System.out.println("Well here goes nothing....");
       
        
        while(loopCounter > 0) {
            System.out.println(" " + love);
            loopCounter--;
        }
    }
            
}
