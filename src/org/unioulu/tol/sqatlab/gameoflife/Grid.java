package org.unioulu.tol.sqatlab.gameoflife;

import java.util.List;


public class Grid {
	
	public int rowAmount;
	public int columnAmount;
	
	public Cell[] cells = new Cell[columnAmount];
	//public List<Cell> cells = null;
	public List<List<Cell>> allCells = null;
	
	
	public int createGrid(int rowAmount)
	{
		for(int i = 0; i<rowAmount; i++) 
		{
			allCells.add(cells);
		}
		
		return allCells.size();
	}
	
}
