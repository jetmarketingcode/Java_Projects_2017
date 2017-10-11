
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author apprentice
 */
public class SummativeSums {

    public static void main(String[] args) {

        int[] arr1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] arr2 = {999, -60, -77, 14, 160, 301};
        int[] arr3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 140, 160, 170, 180, 190, 200, -99};

        System.out.println("Array #1 is:" + SummativeSums.sumArray(arr1));
        System.out.println("Array #2 is: " + SummativeSums.sumArray(arr2));
        System.out.println("Array #3 is: " + SummativeSums.sumArray(arr3));

    }

    public static int sumArray(int[] arr) {

        int sum = 0;
        

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

        }
        return sum;
    }

}
