/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.may11;

/**
 *
 * @author apprentice
 */
public class May11 {
    
    public static void main(String[] args) {
        int i = 5;
        i= shift(i);
        System.out.println(i);
        int x = 8;
        shift(x);
    }
    
    public static int shift(int num){
        num = num + 2;
        return num;
    }
}
