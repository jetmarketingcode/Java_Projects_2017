/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.testweekone;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TestWeekOne {

    public static void main(String[] args) {

        String playAgain;
        do {
            //declared variables and inputs for paper,rock,scissors
            String chooseNumberOfRounds;
            int numberOfRoundsToPlay;
            int playerWeapon;
            Scanner inputReader = new Scanner(System.in);
            Random userGenerator = new Random();
            int tie = 0;
            int comp = 0;
            int user = 0;

            //prompt for start of game
            System.out.println("Let's battle over paper, rock, scissors");
            System.out.println("How many rounds would you like to play? 1 is the min and 10 is max");
            chooseNumberOfRounds = inputReader.nextLine();
            numberOfRoundsToPlay = Integer.parseInt(chooseNumberOfRounds);

            //exit error if user doesn't input 1-10 for number of rounds to play
            if (numberOfRoundsToPlay < 1 || numberOfRoundsToPlay > 10) {
                System.out.println("error");
                System.exit(0);
            } else {

                if (numberOfRoundsToPlay >= 1 && numberOfRoundsToPlay <= 10) {

                    for (int i = 0; i < numberOfRoundsToPlay; i++) {
                        System.out.println("Please choose your weapon, enter a number: 0 for Rock,  1 for Paper, or 2 for Scissors");
                        playerWeapon = inputReader.nextInt();

                        //random generated hand for computers 
                        int computerRandom = userGenerator.nextInt(3);
                        if (computerRandom == playerWeapon) {
                            System.out.println("tie");
                            tie++;
                        } else if (computerRandom == 0 && playerWeapon == 1) {
                            System.out.println("you win");
                            user++;
                        } else if (computerRandom == 0 && playerWeapon == 2) {
                            System.out.println("you lose");
                            comp++;
                        } else if (computerRandom == 1 && playerWeapon == 0) {
                            System.out.println("You win");
                            user++;
                        } else if (computerRandom == 1 && playerWeapon == 2) {
                            System.out.println("you win");
                            user++;
                        } else if (computerRandom == 2 && playerWeapon == 0) {
                            System.out.println("you win");
                            user++;
                        } else if (computerRandom == 2 && playerWeapon == 1) {
                            System.out.println("you lose");
                            comp++;
                        }

                    }
                }
                //scoreboard tally for number of wins, losses, ties
                System.out.println("comp won " + comp + " " + "you won " + user + " " + "and we tied " + tie);
                System.out.println("Would you like to play again? yes or no");

            }
            playAgain = inputReader.nextLine();
        } while (playAgain.equals("yes"));

    }

/** not working method 
    public static String userValidate(String prompt) {

        Scanner inputReader = new Scanner(System.in);
        System.out.println(prompt);

        String newString = inputReader.nextLine();

        return newString;
    
    
}*/
}