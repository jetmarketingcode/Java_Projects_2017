/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.forlooptimesforloop;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ForTimesFor {
    
    public static void main(String[] args) {
        
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Please give me a number between 1 and 20....");
        String userInput = inputReader.nextLine();
        int userChoice = Integer.parseInt(userInput);
        
        for(int i = 1; i <= 15; i++) {
            System.out.println(i * userChoice + "");
            }
            
        }
        
    }
    
