package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Grid {

	private Set<Cell> cells = new HashSet<>();
	
	public int getNumNeighbors(Cell cell) {
		int numNeighbors = 0;
		Set<Cell> neigborhood = new HashSet<Cell>();

		for(int i=-1;i<=1;i++){
			Cell neighbor = new Cell(cell.x, cell.y + i);
			if(cells.contains(neighbor)){
				numNeighbors++;
			}
		}
		return numNeighbors-1;
	}

	public void addCell(Cell cell) {
		cells.add(cell);
	}

}
