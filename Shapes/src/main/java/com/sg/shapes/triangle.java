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
public class triangle extends Shapes {

    private double height;
    private double base;
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public triangle(double  threeSideTri){
      this.height = threeSideTri;
        this.base = threeSideTri;
        this.sideOne = threeSideTri;
        this.sideTwo = threeSideTri;
        this.sideThree = threeSideTri;
    }

    @Override
    public double area() {
        return (base * height)/2;
    }
    public double perimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
