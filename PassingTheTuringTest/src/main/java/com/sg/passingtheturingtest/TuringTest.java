/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.passingtheturingtest;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TuringTest {

    public static void main(String[] args) {

        String name;
        int age;
        String color;
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What is your name?");
        name = inputReader.next();
        System.out.print("Hi there: " + name);
        System.out.println(" My name is granite");
        System.out.println("What is your favorite color " + name);
        color = inputReader.next();
        System.out.println("you really like " + color + "?");
        System.out.println("what is your age?");
        age = inputReader.nextInt();
        System.out.println("You are not " + age + "!");
        System.out.println("Well my favorite color is blue and I am 33");
        
    
    }
}
