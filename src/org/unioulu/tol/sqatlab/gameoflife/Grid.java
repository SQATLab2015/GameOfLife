package org.unioulu.tol.sqatlab.gameoflife;

import java.util.List;


public class Grid {
	
	public int rowAmount;
	public int columnAmount;
	
	public List<List<Cell>> cells = null;
	
	
	public void createGrid()
	{
		for(int i = 0; i<rowAmount; i++) 
		{
			cells.add(new List<Cell>());
		}
	}
	
}
