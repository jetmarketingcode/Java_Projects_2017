/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.user.io;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String [] args){
        ImpIO screenTest = new ImpIO();
        System.out.println(screenTest.readDouble(" give me a number",1,21));
        //System.out.println(screenTest.readInt("give me another number"));
    }
}
