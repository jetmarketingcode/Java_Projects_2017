/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.opinionatorrandomifelseetc;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class Opinionator {

    public static void main(String[] args) {

        Random rGen = new Random();

        System.out.println("I can't decide what animal I like the best.");
        System.out.println("I know! Random can decide for me");

        int x = rGen.nextInt(6);

        System.out.println("The number we chose was: " + x);
        
        

        if (x == 0) {
            System.out.println("Llamas are the best");
        } else if (x == 1) {
            System.out.println("Dodos are the best");
        } else if (x == 2) {
            System.out.println("Woolly Mammoths are the best");
        } else if (x == 3) {
            System.out.println("Sharks are the best");
        } else if (x == 4) {
            System.out.println("Cockatoos are the best");
        } else if (x == 5) {
            System.out.println("Moles are the best");
        }
    }
}
