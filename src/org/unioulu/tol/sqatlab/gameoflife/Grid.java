package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Grid {
	
	private Set<Cell> cells = new HashSet<>();
	
	public int getNumNeighbors(Cell cell) {
		int numNeighbors = 0;
		Set<Cell> neighborhood = new HashSet<Cell>();
		for(int dx=-1; dx <= 1; dx++){
			for(int dy=-1; dy <= 1; dy++){
				Cell neighbor = new Cell(cell.x+dx, cell.y + dy);
			
				if(cells.contains(neighbor)) {
					numNeighbors++;
				}
			}
			
		}
		
		return numNeighbors-1;
	}

	public void addCell(Cell cell) {
		
		cells.add(cell);
	}



}
