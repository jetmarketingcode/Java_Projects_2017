/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public class DVDLibraryDAOFileImpl implements DVDLibraryDAO {
    
    public static final String DVD_ROSTER_File = "DVD.txt";
    public static final String DELIMITER = "::";
    
    
    private Map<String, DVD> dvds = new HashMap<>();
    
    

   @Override
	public DVD addDVD(String currentDVD, DVD dvd) {
	    DVD newDVD = dvds.put(currentDVD, dvd);
	    return newDVD;
	}
    @Override
    public List<DVD> getAllDVDs() {
        return new ArrayList<DVD>(dvds.values());
    }

    @Override
    public DVD getDVD(String currentDVD) {
        return dvds.get(currentDVD);
    }

    @Override
    public DVD removeDVD(DVD dvd) {
        throw new UnsupportedOperationException();
    }
    
    
    
}
