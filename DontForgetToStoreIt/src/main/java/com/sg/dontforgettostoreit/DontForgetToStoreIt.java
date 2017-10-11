/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dontforgettostoreit;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DontForgetToStoreIt {
    public static void main(String[] args){
        
        int meaningOfLife = 42;
        double pi = 3.14159;
        String cheese;
        String color;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Give me pi to at least 5 decimals");
        pi = inputReader.nextDouble();
                
        System.out.println("what is the meaning of life");
        meaningOfLife = inputReader.nextInt();
        
        System.out.println("What is your favorite kind of Cheese?");
        cheese = inputReader.next();
        
        System.out.println("what color is better, red or blue");
        color = inputReader.next();
        
        System.out.println("ooh, " + cheese +" "  + color + " sounds delicious");
        System.out.println(" the circumference of life is " + (2 * pi * meaningOfLife));
        
    }
}
