/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.doggenetics;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DogGenetics {

    public static void main(String[] args) {

        //initialized scanner for collecting user's dogs name
        System.out.println("What is your dog's name?");
        Scanner collectUserInput = new Scanner(System.in);

        //collected the name of the user's dog
        String dogsName = collectUserInput.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogsName + "'s " + " prestigious background right here");
        System.out.println(" " + dogsName + " is:");

        int dog1;
        int dog2;
        int dog3;
        int dog4;
        int dog5;

        do {
            //initialized random Generator
            Random randGen = new Random();
            dog1 = randGen.nextInt(100) + 1;
            dog2 = randGen.nextInt(100) + 1;
            dog3 = randGen.nextInt(100) + 1;
            dog4 = randGen.nextInt(100) + 1;
            dog5 = randGen.nextInt(100) + 1;

        } while (dog1 + dog2 + dog3 + dog4 + dog5 != 100);

    System.out.println("your dog " + dogsName + " is\n"  + dog1 + "% " + "poodle\n" + dog2 + "% " + "german shepard\n" + dog3 + "% " + " cockapoo\n" + dog4 + "% " + "labrador\n" + dog5 + "% " + " chesapeake bay");
    }
}
