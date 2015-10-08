package org.unioulu.tol.sqatlab.gameoflife;

import java.util.ArrayList;
import java.util.List;


public class Grid {
	
	public int rowAmount;
	public int columnAmount;
	
	
	
	public Cell[] cellArray = new Cell[columnAmount];
	public List<Cell[]> allCells = null;
	
	
	public int createGrid(int rowAmount)
	{
		for(int i = 0; i<rowAmount; i++) 
		{
			System.out.println("moi");s
			allCells.add(cellArray);
		}
		
		return allCells.size();
	}
	
}
