package org.unioulu.tol.sqatlab.gameoflife;

import org.univoulu.tol.sqatlab.sudoku.SudokuVerifier;

public class Grid {
	Cell zelle =new Cell();
	
   public Cell [][] grid = new Cell [9][9];
     
     public void start() {
    	 for(int i = 0; i < grid.length; i++)
    	        for(int j = 0; j < grid.length; j++) {
    	        	zelle.cell (i,j);
    	        }
    	     
     }
       
       
}
