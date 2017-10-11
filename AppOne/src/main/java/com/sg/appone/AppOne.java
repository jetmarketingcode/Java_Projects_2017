/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.appone;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
    public class AppOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        String operator = null;
        int first = 0;
        int second = 0;
        int result = 0;
        boolean isValid;

        do {
            System.out.print("Enter your first number:");
            input = scanner.nextLine();
            isValid = true;
            for (int i = 0; i < input.length() && isValid; i++) {
                if (!Character.isDigit(input.charAt(i))) {
                    isValid = false;
                }
            }

            if (input.length() == 0) {
                isValid = false;
                System.out.println("Error: you didn't enter a number.");
            } else if (!isValid || input.length() == 0) {
                System.out.println("Error:" + input + " is not a number.");
            } else {
                first = Integer.parseInt(input);
            }
        } while (!isValid);

        do {

            System.out.print("Please enter a single-character operator[+, -, *, /, or %]:");
            operator = scanner.nextLine();
            isValid = operator.length() == 1
                    && (operator.charAt(0) == '+'
                    || operator.charAt(0) == '-'
                    || operator.charAt(0) == '*'
                    || operator.charAt(0) == '/'
                    || operator.charAt(0) == '%');

            if (!isValid) {
                System.out.println("Error: " + operator + " is not a valid operator.");
            }
        } while (!isValid);

        do {
            System.out.print("Enter your second number:");
            input = scanner.nextLine();
            isValid = true;
            for (int i = 0; i < input.length() && isValid; i++) {
                if (!Character.isDigit(input.charAt(i))) {
                    isValid = false;
                }
            }

            if (input.length() == 0) {
                isValid = false;
                System.out.println("Error: you didn't enter a number.");
            } else if (!isValid || input.length() == 0) {
                System.out.println("Error:" + input + " is not a number.");
            } else {
                second = Integer.parseInt(input);
            }
        } while (!isValid);

        switch (operator.charAt(0)) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
        }

        System.out.println(first + " " + operator + " " + second + " = " + result);

    }

    }