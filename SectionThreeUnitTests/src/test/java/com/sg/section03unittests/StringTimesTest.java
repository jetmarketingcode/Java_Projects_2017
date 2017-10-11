/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section03unittests;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class StringTimesTest {
    
    private StringTimes stringTimes = new StringTimes();
    
    public StringTimesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
    public void testStringTimes() {
       String expectedResult = "HiHi";
       assertEquals(expectedResult, stringTimes("Hi" , 2));
    } 
    
    
    /**
     * Test of stringTimes method, of class StringTimes.
     */
   
    
}
