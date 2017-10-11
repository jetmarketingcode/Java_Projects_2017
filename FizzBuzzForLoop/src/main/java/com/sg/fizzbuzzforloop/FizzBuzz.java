/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.fizzbuzzforloop;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class FizzBuzz {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Please enter a number you would like to stop fizzing at? 1-15");
        String stopAt = inputReader.nextLine();
        int halt = Integer.parseInt(stopAt);
        
        for(int i = 0; i <= halt; i++) {
            for (int j = 1; j <= halt; j++ ){
                
            }
        }
    }
            
}
