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
public class rectangle extends Shapes {
    private double width;
    private double length;
    
    public rectangle(double dimension){
        this.width = dimension;
        this.length = dimension;
    }
    
    @Override 
    
    public double area(){
        return width * width;
    }
    
    public double perimeter(){
    return 2 * (width + length);
}
}
