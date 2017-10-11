/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.alittlechaos;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class ALittleChaos {
    public static void main(String[] args) {
       
        Random rGen = new Random();
        int num = rGen.nextInt(100);
        
        System.out.println("Random can make Integers: " + rGen.nextInt());
        
        System.out.println("Or a double: " + rGen.nextDouble());
        
        System.out.println("Or a boolean: " + rGen.nextBoolean());
        
        System.out.println("You can store a radomized result: " + num);
        System.out.println("And use is over and over again: " + num + " " + num);
        
        System.out.println("Or just keep generating new values");
        System.out.println("Here are a bunch of numbers from 1-100: ");
        
        System.out.print(rGen.nextInt(101) + ", ");
        System.out.print(rGen.nextInt(101) + ", ");
        System.out.print(rGen.nextInt(101) + ", ");
        System.out.print(rGen.nextInt(101) + ", ");
        System.out.print(rGen.nextInt(101) + ", ");
        System.out.println(rGen.nextInt(101));
        
        
       /* Random rGen2 = new Random();
        int num2 = rGen2.nextInt(50)+50;
        System.out.println("here is a sample to see the differences....comment out afterwards " + rGen2.nextInt(num2));
        System.out.println("here is a sample to see the differences....comment out afterwards " + rGen2.nextInt(num2));
        System.out.println("here is a sample to see the differences....comment out afterwards " + rGen2.nextInt(num2));
        System.out.println("here is a sample to see the differences....comment out afterwards " + rGen2.nextInt(num2));
        */
    }
}
