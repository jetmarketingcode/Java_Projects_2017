/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.guessgamewithdowhileelseif;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class GuessGameWithDoWhile {

    public static void main(String[] args) {

        boolean keepGuessing = true;
        int myGuess = 34;
        int userGuess;
        Random rGen = new Random();
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please guess the number I am thinking of between 1 - 100");
        String userChoice = inputReader.nextLine();
        userGuess = Integer.parseInt(userChoice);

        

            do {
                System.out.println("Please try again");
                userChoice = inputReader.nextLine();
                userGuess = Integer.parseInt(userChoice);
            } while (userGuess != myGuess);

           if (userGuess == myGuess) {
               System.out.println("You guessed it");
           }
    }
}
