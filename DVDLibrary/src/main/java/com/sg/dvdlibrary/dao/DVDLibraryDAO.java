/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author apprentice
 */
	public interface DVDLibraryDAO {
	    
	    
	    
	    DVD addDVD(DVD dvd);
	    
    /**
     *
     * @return
     */
    List<DVD> getAllDVDs();
	    
    /**
     *
     * @return
     */
    DVD getDVD();
	    
	   
	    DVD removeDVD();
	}
