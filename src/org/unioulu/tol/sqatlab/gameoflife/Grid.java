package org.unioulu.tol.sqatlab.gameoflife;

import java.util.ArrayList;
import java.util.List;


public class Grid {
	
	public int rowAmount;
	public int columnAmount;
	
	public Cell[] cellArray;
	public ArrayList<Cell[]> allCells = new ArrayList<Cell[]>();
	//public List<Cell[]> allCells = null;
	
	
//	public Grid(int rowAmount, int columnAmount) 
//	{
//		this.rowAmount = rowAmount;
//		this.columnAmount = columnAmount;
//		cellArray = new Cell[columnAmount];
//
//	}
	
	
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
