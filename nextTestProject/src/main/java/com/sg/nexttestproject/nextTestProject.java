/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.nexttestproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class nextTestProject {

    public static void main(String[] args) {
        Do {

            Scanner inputReader = new Scanner(System.in);
            Random randomGenerator = new Random();
            int computerWeapon = 0;
            int pickWeapon = 0;
            int tie = 0;
            int userWin = 0;
            int userLoss = 0;

            System.out.println("play me in paper-rock-scissors");
            System.out.println("choose how many rounds to play, 1-10");
            int rounds = inputReader.nextInt();

            System.out.println("choose 0 for rock, 1 for paper, or 2 for scissors");
            pickWeapon = inputReader.nextInt();

            computerWeapon = randomGenerator.nextInt(3);
            for (int i = 0; i < rounds; i++) {

                if (pickWeapon == computerWeapon) {
                    if (pickWeapon == 0) {
                        System.out.println("tie");
                        tie++;
                    } else if (pickWeapon == 1) {
                        System.out.println("tie");
                        tie++;
                    } else if (pickWeapon == 2) {
                        System.out.println("tie");
                        tie++;
                    }
                }
                if (pickWeapon == 0) {
                    if (computerWeapon == 1) {
                        System.out.println("loss");
                        userLoss++;
                    } else {
                        System.out.println("win");
                        userWin++;
                    }
                } else if (pickWeapon == 1) {
                    if (computerWeapon == 0) {
                        System.out.println("win");
                        userWin++;
                    } else {
                        System.out.println("loss");
                        userLoss++;

                    }
                } else {
                    if (computerWeapon == 0) {
                        System.out.println("loss");
                        userLoss++;
                    } else {
                        System.out.println("win");
                        userWin++;
                    }
                }
            }
            while (rounds > 1 && rounds < 10) {
                System.out.println("error");
            }
            System.exit(0);
        }

    }
}
