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
public class DaoStubImpl implements Dao {
    
       Product vend;
    HashMap<String, Object> vendList = new HashMap<>();
    
   public DaoStubImpl() {
     //   vend = new Product();
     //   vend.setItem("");
      //  vend.setPrice("");
      //  vend.setInventory("");
        
        
}

    @Override
    public List<Product> getItem() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getInventory() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product removeInventory() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap getItemInventory() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
