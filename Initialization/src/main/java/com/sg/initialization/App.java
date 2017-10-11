/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.initialization;

/**
 *
 * @author apprentice
 */
public class App {

    public static void main(String[] args) {

        int count = 19;
        Person person = new Person();
        person.setAge(35);
        person.setName("troy");

        System.out.println("Count = " + count);
        System.out.println("Age = " + person.getAge());
        System.out.println("Name = " + person.getName());
    }
}
