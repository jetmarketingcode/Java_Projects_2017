/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vm.ui;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class UserIOConsoleImpl implements UserIO {
    
    
    private BigDecimal BigDecimal;

    @Override
    public void println(String message) {
        System.out.print(message);
    }

    @Override
    public double readDouble(String prompt) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println(prompt);
        String resultsValue = inputReader.nextLine();
        double value = Double.parseDouble(resultsValue);
        return value;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        Scanner inputReader = new Scanner(System.in);
        println(prompt);
        String resultsValue = inputReader.nextLine();
        double value = Double.parseDouble(resultsValue);
        if (value < min || value > max) {
            System.out.println("error...try again");
            readDouble(prompt, min, max);

        }
        return value;
    }

    @Override
    public float readFloat(String prompt) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println(prompt);
        String resultsValue = inputReader.nextLine();
        float value = Float.parseFloat(resultsValue);
        return value;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println(prompt);
        String resultsValue = inputReader.nextLine();
        float value = Float.parseFloat(resultsValue);
        if (value < min || value > max) {
            readFloat(prompt, min, max);
        }
        return value;
    }

    @Override
    public int readInt(String prompt) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println(prompt);
        String resultsValue = inputReader.nextLine();
        int value = Integer.parseInt(resultsValue);
        return value;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println(prompt);
        String resultsValue = inputReader.nextLine();
        int value = Integer.parseInt(resultsValue);
        if (value < min || value > max) {
            readInt(prompt, min, max);
        }
        return value;
    }

    @Override
    public long readLong(String prompt) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println(prompt);
        String resultsValue = inputReader.nextLine();
        long value = Long.parseLong(resultsValue);
        return value;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println(prompt);
        String resultsValue = inputReader.nextLine();
        long value = Long.parseLong(resultsValue);
        if (value < min || value > max) {
            readLong(prompt, min, max);
        }
        return value;
    }

    @Override
    public BigDecimal readBigDecimal(String prompt) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println(prompt);
        String resultsValue = inputReader.nextLine();
        return BigDecimal;
        
        
        
    }

    @Override
    public String readString(String prompt) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println(prompt);
        String result = inputReader.nextLine();
        return result;
    }
}
