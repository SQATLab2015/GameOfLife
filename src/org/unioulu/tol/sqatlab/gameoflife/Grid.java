package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Grid {

	private Set<Cell> cells = new HashSet<>();
	
	public Grid(){
		
	}

	public int getNeighbors(Cell cell) {
		Set<Cell> neighbors = new HashSet<Cell>();
		return 0;
	}

	public void addCell(Cell cell) {
		
		cells.add(cell);
		
	}
	
	
	
}
