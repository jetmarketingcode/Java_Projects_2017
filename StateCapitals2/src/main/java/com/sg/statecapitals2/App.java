/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.statecapitals2;

import java.util.HashMap;

import java.util.Set;

/**
 *
 * @author apprentice
 */
public class App {

    public static void main(String[] args) {

        HashMap<String, StateCapitals2> states = new HashMap<>();

        states.put("Minnesota", new StateCapitals2("St.Paul", 199000, 510));
        states.put("California", new StateCapitals2("Sacrament", 188888, 500));
        states.put("Wisconsin", new StateCapitals2("Madison", 100000, 400));
        states.put("Alaska", new StateCapitals2("Juneau", 111000, 295));
        states.put("Arizona", new StateCapitals2("Phoenix", 1999000, 899));

        Set<String> keys = states.keySet();
        

        for (String k : keys) {
            System.out.println(k);
        }

       for (String k : keys) {
            System.out.println(" " + states.get(k));
        }

       for (String k : keys) {
            System.out.println("" + (k) + " " + states.get(k));

        }

    }
}
