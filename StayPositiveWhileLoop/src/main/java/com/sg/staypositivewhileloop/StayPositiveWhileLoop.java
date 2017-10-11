/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.staypositivewhileloop;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class StayPositiveWhileLoop {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        int num = 0;
        
        System.out.println("Please enter a number between 1-10 and I will make it count down to zero!!");
        String userNumbPick = inputReader.nextLine();
        num = Integer.parseInt(userNumbPick);
        
        System.out.println("Here Goes");
        
        while(num <= 10 && num >= 0) {
            System.out.println(num);
            num--;
        }
    }
}
