/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assumtest;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AssumTest {
   public static void main(String[] args){
   

        
        boolean sure = true;
        int chooseNumberOfRounds = 0;
        int numberOfRoundsToPlay = chooseNumberOfRounds;
        String computerWeapon = "";
        int playerWeapon = 0;
        Scanner inputReader = new Scanner(System.in);
        Random userGenerator = new Random();
        

        System.out.println("Let's battle over paper, rock, scissors");
        System.out.println("How many rounds would you like to play?");
        chooseNumberOfRounds = inputReader.nextInt();
            
           
                
        do
        {
         System.out.println("Please choose your weapon, enter a number: 1 for Rock,  2 for Paper, or 3 for Scissors");
        
         int selectYourWeapon = inputReader.nextInt();
         int computerRandom = userGenerator.nextInt(3)+1;
        }
         while {
            if (numberOfRoundsToPlay >= 1 && numberOfRoundsToPlay <= 10)
            {
            
            }    
            else if (computerRandom == 1)
            {
                    computerWeapon = "Rock";
            }
            else if (computerRandom == 2)
            {
                    computerWeapon = "Paper";
            }
            else if (computerRandom == 3)
            {
                    computerWeapon = "Scissors";
            }       
                
            
            System.out.println("I have " + computerWeapon );
             
        
                   
   }
   }                        
       
       

   }
       
