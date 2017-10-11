/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vm.service;

import com.sg.vm.dao.AuditDao;
import com.sg.vm.dao.Dao;
import com.sg.vm.dao.PersistenceException;
import com.sg.vm.dto.Product;
import java.math.BigDecimal;
import java.util.HashMap;

/**
 *
 * @author apprentice
 */
public class ServiceLayerImpl implements ServiceLayer {
      private final AuditDao auditDao;
    Dao dao;

    private BigDecimal cash = new BigDecimal("0.00");

    public ServiceLayerImpl(Dao dao, AuditDao auditDao) {
        this.dao = dao;
        this.auditDao = auditDao;
        this.cash = new BigDecimal(0);
    }

    public ServiceLayerImpl(Dao dao, AuditDao auditDao, BigDecimal cash) {
        this.cash = cash;
        this.dao = dao;
        this.auditDao = auditDao;
    }

    public HashMap getInventoryHash() throws PersistenceException {
     return dao.getItemInventory();
}
    /**
     *
     * @param Inventory
     * @return
     * @throws PersistenceException
     */
    public Product removeInventory(String Inventory) throws PersistenceException {
        Product removedInventory = dao.removeInventory();
       // auditDao.writeAuditEntry("VendingMachine " + Inventory + " REMOVED.");
        return removedInventory;
    }

    /**
    // public Product removeInventory(int Inventory) throws PersistenceException {
    //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    // }
    private String buildProductOptions(HashMap<String, String[]> prod, String s) {
        //if cash value is 0 return an empty string
        BigDecimal a = new BigDecimal(0);
        if (this.cash.compareTo(a) == 0) {
            return s;
        }//if not build the options
        return "TODO";

    }

    private String buildProductOption(HashMap<String, String[]> prod, String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param menuSelection
     * @return
     * @throws PersistenceException
     
     */
    public String vend(int menuSelection) throws PersistenceException, InsufficientFundsException, OutOfInventoryException {
        Product p = getProd(menuSelection);

        if (p.getInventory() < 1) {
            throw new OutOfInventoryException("out of inventory");

        }

        if (p.getPrice().compareTo(cash) > 0) {
            throw new InsufficientFundsException("not enough cash");
        }

        int quant = p.getInventory();
        quant--;
        p.setInventory(quant);

        BigDecimal cost = p.getPrice();
        BigDecimal change = cash.subtract(cost);

        // dao.writeInventory();
        //make change here;
        return "TODO";

    }

    public Product getProd(int menuSelection) throws PersistenceException {
        HashMap<String, Product> m = dao.getItemInventory();
        int i = 1;
        String prodName;
        for (String Key : m.keySet()) {
            if (i == menuSelection) {
                return m.get(Key);

            }
            i++;
        }
        return null;
    }

   // @Override
    //public HashMap getInventoryHash() throws PersistenceException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    private String change(BigDecimal change) {
        int cents;
        int penny;
        int nickel;
        int dime;
        int quarter;

        int amount = Integer.valueOf(String.valueOf(change));
        cents = (amount * 100);
        quarter = cents / 25;
        cents %= 25;
        dime = cents / 10;
        cents %= 10;
        nickel = cents / 5;
        cents %= 5;

        penny = cents;

        String changeDue = ("Please collect yor change: " + quarter + " quarter(s)" + dime + "dime(s)" + nickel + "nickel(s)");
        return changeDue;

    }

    //public void vend(HashMap menuSelection) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //  }

    
}
