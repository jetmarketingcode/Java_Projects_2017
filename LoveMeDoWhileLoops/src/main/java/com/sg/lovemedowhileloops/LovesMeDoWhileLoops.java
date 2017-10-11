/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.lovemedowhileloops;

/**
 *
 * @author apprentice
 */
public class LovesMeDoWhileLoops {
    public static void main(String[] args) {
        
        int loopCount = 17;
        String love = "It loves me Not!\n It loves Me!!";
        System.out.println("Well here goes nothing....");
       // System.out.println(" " + love);
        
        while(loopCount > 0) {
            System.out.println(" " + love);
            loopCount--;
        }
    }
}
