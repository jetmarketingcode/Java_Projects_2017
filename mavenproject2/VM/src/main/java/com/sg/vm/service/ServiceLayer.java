/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vm.service;

import com.sg.vm.dao.PersistenceException;
import com.sg.vm.dto.Product;
import java.util.HashMap;

/**
 *
 * @author apprentice
 */
public interface ServiceLayer {
    
     Product removeInventory(String Inventory) throws
            PersistenceException;

   public HashMap getInventoryHash() throws
          PersistenceException;

    public String vend(int menuSelection) throws PersistenceException, InsufficientFundsException, OutOfInventoryException;
}
