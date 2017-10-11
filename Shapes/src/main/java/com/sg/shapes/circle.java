/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.shapes;

/**
 *
 * @author apprentice
 */
public class circle extends Shapes {
    private double PI = 3.14;
    private double Radius;
    
    public circle(double findPi){
        this.PI = findPi;
        this.Radius = findPi;
    }
    
   
    @Override
    public double area() {
        return  PI * Radius * Radius;
    }
    
    
    public double perimeter(){
        return 2 * PI * Radius;
    }
}


