/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.guessme;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class GuessMe {

    public static void main(String[] args) {
        int myNum = 44;
        int guestGuess = 0;
        Scanner scr = new Scanner(System.in);

        System.out.println("please enter a number and see if it matches mine");
        guestGuess = scr.nextInt();

        if (guestGuess < myNum) {
            System.out.println("too low");
            guestGuess = scr.nextInt();
        } else if (guestGuess > myNum) {
            System.out.println("too high");
            guestGuess = scr.nextInt();
        } else {

            System.out.println("lucky guess");
        }
    }
}
