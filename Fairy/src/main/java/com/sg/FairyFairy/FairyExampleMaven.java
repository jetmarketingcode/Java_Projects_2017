/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FairyFairy;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import static io.codearte.jfairy.producer.person.PersonProperties.male;
import static io.codearte.jfairy.producer.person.PersonProperties.minAge;

/**
 *
 * @author apprentice
 */
public class FairyExampleMaven {
    
    public static void main(String[] args) {
       
        Fairy fairy = Fairy.create();
Person person = fairy.person();

System.out.println(person.getFullName());            
// Chloe Barker
System.out.println(person.getEmail());               
// barker@yahoo.com
System.out.println(person.getTelephoneNumber());     
// 690-950-802

Person adultMale = fairy.person(male(), minAge(21));
System.out.println(adultMale.isMale());           
// true
System.out.println(adultMale.getDateOfBirth());      
// at least 21 years earlier
        
        
        
        
        
    }
    
}
