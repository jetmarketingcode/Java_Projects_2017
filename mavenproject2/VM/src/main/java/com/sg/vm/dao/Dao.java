/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vm.dao;

import com.sg.vm.dto.Product;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface Dao {
    
       
    /**
     *
     * @return
     * @throws PersistenceException
     */
    List<Product> getItem()
	     throws PersistenceException;
     
     Product getInventory()
             throws PersistenceException;
     
    /**
     *
     * @return
     * @throws PersistenceException
     */
    Product removeInventory()
	     throws PersistenceException;

  //  public HashMap getQuant()
         //   throws PersistenceException;
    
   HashMap getItemInventory()
    throws PersistenceException;

   // public HashMap getQuant();

    /**
     *
     */
   // public void writeInventory();
  
    
}
