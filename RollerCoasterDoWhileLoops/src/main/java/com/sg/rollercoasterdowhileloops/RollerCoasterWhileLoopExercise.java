/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.rollercoasterdowhileloops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class RollerCoasterWhileLoopExercise {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("We are going to go on a roller coaster....");
        System.out.println("Let me know when you want to get off....!!!");
        
        String keepRiding = "y";
        int loopsLooped = 0;
        
        while(keepRiding.equals("y")) {
            System.out.println("WheeeeeeeeeeeeeeEEEEeeeeeee!!!");
            System.out.println("Want to keep going? (y/n) :");
            
            keepRiding = inputReader.nextLine();
            loopsLooped++;
        }
        
        System.out.println("Wow, that was FUN!!");
        System.out.println("We looped that loop " + loopsLooped + " times!");
    }
    
}
