/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.healthyhearts;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HealthyHearts {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        double age;
        double maxHeartRate;
        double targetHeartRateMin;
        double targetHeartRateMax;
        double targetHeartRate;

        System.out.println("please enter your age to find your max heart rate and your target heart rate");
        String getAge = inputReader.nextLine();
        age = Double.parseDouble(getAge);

        maxHeartRate = 220 - age;
        targetHeartRateMin = maxHeartRate * .50;
        targetHeartRateMax = maxHeartRate * .85;
        System.out.println("your max heart rate is " + maxHeartRate);
        System.out.println("and your target heart rate zone is " + targetHeartRateMin + " " + "to " + targetHeartRateMax + " BPM");

        // System.out.println("your max heart rate is " + targetHeartRate);
    }
}
