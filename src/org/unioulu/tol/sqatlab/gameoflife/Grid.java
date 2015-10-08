package org.unioulu.tol.sqatlab.gameoflife;

import java.util.ArrayList;
import java.util.List;


public class Grid {
	
	public int rowAmount;
	public int columnAmount;
	
	
	
	public List<Cell> cellArray = null;
	public List<Cell[]> allCells = null;
	
	
	public int createGrid(int rowAmount)
	{
		for(int i = 0; i<rowAmount; i++) 
		{
			allCells.add(cellArray);
		}
		
		return allCells.size();
	}
	
}
