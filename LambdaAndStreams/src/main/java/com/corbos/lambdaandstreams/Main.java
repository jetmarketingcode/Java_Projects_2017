/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corbos.lambdaandstreams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 *
 * @author parallels
 */
public class Main {

    public static void main(String[] args) throws IOException {

        PersonDataStore dataStore = new PersonDataStore();
        List<Person> people = dataStore.all();

        // People from Russia (or any other country starting with "Ru").        
        people.stream()
                .filter(p -> p.getCountry().startsWith("Ru"))
                .forEach(Main::print);
    }

    public static void print(Person p) {
        System.out.printf("%s: %s %s, %s", p.getCountry(), p.getFirstName(), p.getLastName(), p.getEmailAddress());
        System.out.println("");
    }
}

interface GenericInterface {
}

//AtomicInteger ai = new AtomicInteger(1);
//        int result = people.stream()
//                .map(i -> i.getId())
//                .max(Integer::compare)
//                .get();
//        List<Person> otherPeople = people.stream()
//                .filter(i -> i.getCountry().startsWith("Ru"))
//                .collect(Collectors.toList());
//        people.stream()
//                .filter(i -> i.getCountry().startsWith("Ru"))
//                .map(i -> new GenericInterface() {
//                    int number = ai.getAndIncrement();
//                    String name = i.getLastName();
//                })
//                .forEach(i -> System.out.printf("%s: %s\n", i.number, i.name));
//        
//        people.stream()
//                .filter(i -> i.getCountry().startsWith("C"))
//                .forEach(i -> System.out.println(i.toString()));
//        people.stream()
//                .filter(i -> i.getCountry().startsWith("C"))
//                .map(i -> new GenericInterface(){
//                    String name = String.format("%s %s", i.getFirstName(), i.getLastName());
//                    int petCount = i.getPets().size();
//                })
//                .filter(i -> i.petCount > 0)
//                .forEach(i -> System.out.printf("%s: %s\n", i.name, i.petCount));
//        people.stream()
//                .flatMap(i -> i.getPets().stream())
//                .sorted((a, b) -> a.getName().compareTo(b.getName()))
//                .limit(100)
//                .forEach(i -> System.out.printf("%s %s\n", i.getName(), i.getPetType()));
