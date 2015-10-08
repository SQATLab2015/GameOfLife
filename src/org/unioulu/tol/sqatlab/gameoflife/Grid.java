package org.unioulu.tol.sqatlab.gameoflife;

import java.util.ArrayList;


public class Grid {
	
	public Cell[] cellArray;
	public ArrayList<Cell[]> allCells = new ArrayList<Cell[]>();
	

	public int createGrid(int rowColumnAmount)
	{
		for(int i = 0; i<rowColumnAmount; i++) 
		{
			cellArray = new Cell[rowColumnAmount];
			allCells.add(cellArray);
		}
		
		return allCells.size();
	}
	
}
