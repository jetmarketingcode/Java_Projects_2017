/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.doordonotdowhileloops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DoWhileLoopExerciseDoOrDoNot {

    public static void main(String[] args) {

        boolean doIt;
        boolean iDidIt;
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Should I do it? (y/n) ");

        if (inputReader.next().equals("y")) {
            doIt = true; // Do It!!!
        } else {
            doIt = false; //Don't Do It!!
        }
        do {
            iDidIt = true;
            break;

        } while (doIt);

        if (doIt && iDidIt) {
            System.out.println("I did it!!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to....But I did it anyways!");
        } else {
            System.out.println("Don't look at me, I didnt do anything!");
        }

    }
}
