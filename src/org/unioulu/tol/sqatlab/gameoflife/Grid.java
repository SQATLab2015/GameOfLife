package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Grid {
	private Set<Cell> cells;   
	int squareLength;
	
	public Grid(int squareLength){
		cells = new HashSet<>();
		this.squareLength = squareLength;
	}
	
	
	public int getNumNeighbors(Cell cell) {
		int numNeighbors = 0;
		for (int dx=-1; dx<=1; dx ++) {
			for (int dy=-1; dy<=1; dy ++) {
				Cell neighbor = new Cell(cell.x + dx, cell.y + dy, "Alive");
				if (cells.contains(neighbor)) {
					numNeighbors++;
				} 
			}
		}
		if(cell.getState().equals("Alive"))
		{
			numNeighbors--;
		}
		
		return numNeighbors;
	}
	public void addCell(Cell cell) {
		cells.add(cell);		
	}

}
