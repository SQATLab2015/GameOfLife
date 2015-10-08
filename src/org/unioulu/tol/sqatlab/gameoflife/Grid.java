package org.unioulu.tol.sqatlab.gameoflife;

import java.util.ArrayList;


public class Grid {
	
	public Cell[] cellArray;
	public ArrayList<Cell[]> allCells = new ArrayList<Cell[]>();
	

	public int createGrid(int rowAmount, int columnAmount)
	{
		for(int i = 0; i<rowAmount; i++) 
		{
			cellArray = new Cell[columnAmount];
			allCells.add(cellArray);
		}
		
		return allCells.size();
	}
	
}
