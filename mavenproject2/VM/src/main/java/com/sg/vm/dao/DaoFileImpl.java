/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vm.dao;

import com.sg.vm.dto.Product;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class DaoFileImpl implements Dao {
    
    public HashMap getItemInventory() throws PersistenceException {
    return products;
}
    public static final String INVENTORY_FILE = "Inventory.txt";
    public static final String DELIMITER = "::";

    private HashMap<String, Product> products = null;
    // public HashMap getQuant() throws PersistenceException {

    // return loadInventory();
    // }
    private HashMap loadInventory() throws PersistenceException {
        Scanner scanner;

        try {
            // Create Scanner for reading the file
            scanner = new Scanner(new BufferedReader(new FileReader(INVENTORY_FILE)));
        } catch (FileNotFoundException e) {
            throw new PersistenceException("-_- out of inventory.", e);
        }

        String currentLine;

        HashMap<String, Product> products = new HashMap<>();

        while (scanner.hasNextLine()) {

            String[] currentTokens;
            currentTokens = new String[3];
            currentLine = scanner.nextLine();

            currentTokens = currentLine.split(DELIMITER);
            Product currentProduct = new Product(currentTokens[0], new BigDecimal(currentTokens[1]), Integer.parseInt(currentTokens[2]));
            products.put(currentTokens[0], currentProduct);

        }
        // close scanner
        scanner.close();
        return products;
    }


    public void writeInventory() throws PersistenceException {

        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(INVENTORY_FILE));
        } catch (IOException e) {
            throw new PersistenceException("insufficient funds, e");
        }

         
            
    Set<String> keys = products.keySet();
    
    
    
    for (String k : keys){
       Product p = this.products.get(k);
        
        
            
            out.println(p.getItem() + DELIMITER
                    + p.getPrice() + DELIMITER
                    + p.getInventory());

            out.flush();
        }

        out.close();
    }

    @Override
    public List<Product> getItem()
            throws PersistenceException {
        loadInventory();
        return new ArrayList<>();

    }

    public int getInventory(String itemName)
            throws PersistenceException {
        loadInventory();
        Product p = products.get(itemName);
        return p.getInventory();
    }

    public void removeInventory(String itemName)
            throws PersistenceException {
        Product p = products.get(itemName);
        loadInventory();
        int i = p.getInventory();
        i--;
        p.setInventory(i);

    }

    @Override
    public Product getInventory() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product removeInventory() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     * @throws PersistenceException
     */
  //  @Override
    //public HashMap getQuant() throws PersistenceException {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //  }
    
    
}
