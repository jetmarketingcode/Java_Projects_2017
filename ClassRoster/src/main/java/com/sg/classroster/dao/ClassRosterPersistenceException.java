/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.dao;

import com.sg.classroster.dto.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */

    public class ClassRosterPersistenceException extends Exception{
      
	    
	    public ClassRosterPersistenceException(String message) {
	        super(message);
	    }
	    
	    public ClassRosterPersistenceException(String message, Throwable cause) {
	        super(message, cause);
	    }
	    
	}

