/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.primitivesandobjectsasmethods;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args){
        
    
    int count = 19;
    changeMyValue(count);
    System.out.println("count = " + count);
    
   Person myPerson = new Person();
   myPerson.setAge(24);
   myPerson.setName("Joe");
   
   System.out.println("person = " + myPerson.getAge());
   System.out.println("person = " + myPerson.getName());
   
   changeMyName(myPerson);
   
   System.out.println("Age = " + myPerson.getAge());
   System.out.println("Name = " + myPerson.getName());
}
    public static void changeMyValue(int value){
        value = 21;
    }
    public static void changeMyName(Person person){
        person.setName("Steve");
    }
}