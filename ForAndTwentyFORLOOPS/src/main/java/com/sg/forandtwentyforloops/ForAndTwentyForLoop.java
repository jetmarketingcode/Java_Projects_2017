/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.forandtwentyforloops;

/**
 *
 * @author apprentice
 */
public class ForAndTwentyForLoop {
    public static void main(String[] args) {
        
        int birdsPie = 0;
        for(int i = 0; i < 24; i++) {
            System.out.println("Blackbird number " + i + " goes into the pie");
            birdsPie++;
        }
        
        System.out.println("There are " + birdsPie + " birds in there");
        System.out.println("Quite the pie full!!");
    }
}
