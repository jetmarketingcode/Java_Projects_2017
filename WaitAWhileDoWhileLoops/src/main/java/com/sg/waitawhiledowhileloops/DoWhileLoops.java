/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.waitawhiledowhileloops;

/**
 *
 * @author apprentice
 */
public class DoWhileLoops {
    public static void main(String[] args) {
        
        int timeNow = 5;
        int bedTime = 10;
        
        while(timeNow < bedTime) {
            
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a little longer!");
            
            timeNow++; // need a counter or it will keep going
            
        }
        System.out.println("Oh, It's " + timeNow + " o'clock!");
        System.out.println("I better get to bed!!!");
    }
}
