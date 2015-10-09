package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Grid {
	private Set<Cell> cells = new HashSet<>();   
	
	public int getNeighbors(Cell cell) {
		Set<Cell> neighbors = new HashSet <Cell>();
		Set<Cell> neighborhood = new HashSet <Cell>();
		for (int i=-1; i<=1; i ++) {
			Cell neighbor = new Cell(cell.x, cell.y + i);
		}
		
		
		return 0;
		
	}

	public void addCell(Cell cell) {
		cells.add(cell);		
	}

}
