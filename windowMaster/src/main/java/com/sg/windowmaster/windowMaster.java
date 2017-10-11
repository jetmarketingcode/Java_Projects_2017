/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.windowmaster;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class windowMaster {
    public static void main(String[] args){
        float height;
        float width;
        
        String stringHeight;
        String stringWidth;
        
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("please enter window height");
        stringHeight = sc.nextLine();
       
        System.out.println("please enter window width");
        stringWidth = sc.nextLine();
        
        height = Integer.parseInt(stringHeight);
        width = Integer.parseInt(stringWidth);
        
        areaOfWindow = height * width;
        
        perimeterOfWindow = 2 * (height + width);
        
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        System.out.println("Window width = " + stringHeight);
        System.out.println("Window height = " + stringWidth);
        System.out.println("window area = " + areaOfWindow);
        System.out.println("perimeter of window = " + perimeterOfWindow);
        System.out.println("total cost is = " + cost);
    }
}
