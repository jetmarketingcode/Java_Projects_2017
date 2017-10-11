/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vm.service;

/**
 *
 * @author apprentice
 */
public class OutOfInventoryException extends Exception {
    
     public OutOfInventoryException(String message) {
        super(message);
    }

    public OutOfInventoryException(String message,
            Throwable cause) {
        super(message, cause);
    }
}
