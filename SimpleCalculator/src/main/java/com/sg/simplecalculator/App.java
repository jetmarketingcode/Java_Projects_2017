/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class App {

    public static void main(String[] args) {
        
        while(true) {
            SimpleCalculator results = new SimpleCalculator();
            String operator;

            Scanner inputReader = new Scanner(System.in);

            
            System.out.println("please enter an operator: *, /, +, - or if you want to quit at anytime enter no");
            operator = inputReader.nextLine();
            
            if (operator.equals("no")){
                System.out.println("thank you for playing!!! have a splendid day");
                System.exit(0);
            }

            System.out.println("please enter a number");
            int numb1 = inputReader.nextInt();

            System.out.println("please enter another number");
            int numb2 = inputReader.nextInt();

            if (operator.equals("*")) {
                results = new SimpleCalculator();
                System.out.println(results.multiplication(numb1, numb2));

            } else if (operator.equals("/")) {
                results = new SimpleCalculator();
                System.out.println(results.division(numb1, numb2));

            } else if (operator.equals("+")) {
                results = new SimpleCalculator();
                System.out.println(results.addition(numb1, numb2));
            } else if (operator.equals("-")) {
                results = new SimpleCalculator();
                System.out.println(results.subtraction(numb1, numb2));

            }

        }

    }
}
