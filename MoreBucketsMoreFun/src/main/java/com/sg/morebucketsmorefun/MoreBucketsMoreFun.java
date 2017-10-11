/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.morebucketsmorefun;

/**
 *
 * @author apprentice
 */
public class MoreBucketsMoreFun {
    public static void main (String [] args){
         // Declare ALL THE THINGS
        // (Usually it's a good idea to declare them at the beginning of the program)
        
        int butterflies, beetles, bugs;
        String size, age, color, thing;
        double number;

        // Now give a couple of them some values
        butterflies = 2;
        beetles = 4;

        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but " + bugs + " bugs total.");

        System.out.println("Uh oh, my dog ate one.");
        butterflies--;//this is a unary operator
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But still " + bugs + " bugs left, wait a minute!!!");//the unary operator changes butterflies but bugs already has a fixed value;
        System.out.println("Maybe I just counted wrong the first time...");
    }
}
