/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bestadderever;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BestAdderEver {
   public static void main(String[] args) {
       int numb1, numb2, numb3;
       Scanner inputReader = new Scanner(System.in);
       System.out.println("Please enter your first number");
      numb1 = inputReader.nextInt();
       System.out.println("Please enter your secontd number");
       numb2 = inputReader.nextInt();
       System.out.println("Please enter your thrid number");
       numb3 = inputReader.nextInt();
       System.out.println("numb1 " + numb1 + " numb2 " + numb2 + " numb3 " + numb3);
       
       int sum = numb1 + numb2 + numb3;
       System.out.println(sum);
       
   }
}
