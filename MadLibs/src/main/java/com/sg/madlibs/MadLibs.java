/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.madlibs;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MadLibs {
    public static void main(String [] args) {
        
        Scanner inputReader = new Scanner(System.in);
        String noun1, noun2, adj1, adj2, pluralNoun1, pluralNoun2, pluralNoun3, presentVerb, pastVerb;
        int num1;
        
        System.out.println("Please give me a noun");
        noun1 = inputReader.nextLine();
        
        System.out.println("Please give me an adjective");
        adj1 = inputReader.nextLine();
        
        System.out.println("Please enter a noun");
        noun2 = inputReader.nextLine();
        
        System.out.println("Please give me a number");
        String numPar = inputReader.nextLine();
        num1 = Integer.parseInt(numPar);
        
        
        System.out.println("Please give me an adjective");
        adj2 = inputReader.nextLine();
        
        System.out.println("Please give me a plural noun");
        pluralNoun1 = inputReader.nextLine();
        
        System.out.println("Pleases give me another plural noun");
        pluralNoun2 = inputReader.nextLine();
        
        System.out.println("Please give me one last pluralNoun");
        pluralNoun3 = inputReader.nextLine();
        
        System.out.println("Now please give me a present tense verb");
        presentVerb = inputReader.nextLine();
        
        System.out.println("Please give me the past tense of that same verb");
        pastVerb = inputReader.nextLine();
        
        System.out.println(noun1 + ": the " + adj1 + " frontier." + 
                " These are the voyages of the starship" + " " +
                noun2 + "." + " Its" + " " + num1 + "-year mission: to explore strange " 
                + adj2 +  " " + pluralNoun1 + ", to seek out " + adj2 + " " + pluralNoun2 +
                " and" + " " + adj2 + " " + pluralNoun3 + ", to boldly" + " " + presentVerb + 
                " where no one has" + " " + presentVerb + " " + pastVerb + " before.");
        
        
        
        
        
        
        
        
    }
    
}
