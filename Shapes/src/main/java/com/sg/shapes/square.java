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
public class square extends Shapes {

    private double width;
    private double length;

    public square(double dimension, String color){
        this.width=dimension;
        this.length=dimension;
        this.setColor(color);
    }
    
    @Override
    public double area() {
        return length * width;
    }
    
    
    public double perimeter(){
        return 2 * (length + width);
    }
}
