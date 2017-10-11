/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.fortimesforlooppointcounter;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ForTimesHarderLoop {

    public static void main(String[] args) {
        int i = 0;
        Scanner inputReader = new Scanner(System.in);
        int choiceChosen = 0;
        String userChoice;
        String correct = "that is so right on, great job!";
        String wrong = "you better study your math multiplication tables next time!";
        int count = 0;
        int userGuess = 0;
        System.out.println("Please enter a number between 1 and 15");
        userChoice = inputReader.nextLine();
        choiceChosen = Integer.parseInt(userChoice);

        do {
            for (i = 1; i <= 15; i++) {
                int sum = i * choiceChosen;
                System.out.println(i + "*" + choiceChosen + " =" + " ?");
                String guessTime = inputReader.nextLine();
                userGuess = Integer.parseInt(guessTime);

                if (userGuess != sum) {
                    System.out.println("" + wrong);
                   
                } else {
                    System.out.println("" + correct);
                    count++;
                }
            }
        } while (i <= 15);
        
        System.out.println("You got " + count + " right out of 15 guesses!");
    }

}
