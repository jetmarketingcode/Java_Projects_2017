/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.statecapitals2;


/**
 *
 * @author apprentice
 */
public class StateCapitals2 {
    private String name;
    private final int population;
    private final double squareMileage;

    public StateCapitals2(String name,int population, double squareMileage){
       this.name=name;
        this.population = population;
        this.squareMileage = squareMileage;
        
        
    }
    /**
     * @return the name
     */
    public String getName() {
       return name;
   }

    /**
     * @return the population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * @return the squareMileage
     */
    public double getSquareMileage() {
        return squareMileage;
    }
    
 
}

