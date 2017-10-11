/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.thecountjackulaforloop;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TheCount {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please enter a starting number for the Count Jackula");
        String num1 = inputReader.nextLine();
        int start = Integer.parseInt(num1);

        System.out.println("Please enter a number to step by...");
        String num2 = inputReader.nextLine();
        int step = Integer.parseInt(num2);

        System.out.println("Now give me an ending number...it must be larger than the start");
        String num3 = inputReader.nextLine();
        int end = Integer.parseInt(num3);

        System.out.println("the starting number you chose was: " + start + "your step number is: " + step + "your ending number is : " + end);

        int i = 0;
        for (i = start; i <= end; i = i + step) {
            System.out.println(i + "");

        }

    }
}
