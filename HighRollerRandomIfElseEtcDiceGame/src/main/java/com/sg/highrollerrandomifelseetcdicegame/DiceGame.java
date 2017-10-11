/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.highrollerrandomifelseetcdicegame;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class DiceGame {
    public static void main(String[] args) {
        
        Random dieRoller = new Random();
        
        
        int rollResult = dieRoller.nextInt(6) + 1;
        
        System.out.println("Let's Roll the Dice Baby!!");
        System.out.println("You rolled a: " + rollResult);
    }
}
