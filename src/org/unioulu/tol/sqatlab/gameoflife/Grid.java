package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Grid {
	public Set<Cell> cells;   
	int squareLength;
	
	public Grid(int squareLength){
		cells = new HashSet<>();
		this.squareLength = squareLength;
	}
	
	
	public int getNumNeighbors(Cell cell) throws CustomLifeException {
		int numNeighbors = 0;
		for (int dx = -1; dx <= 1; dx++) {
			for (int dy = -1; dy <= 1; dy++) {
				Cell neighbor = new Cell(cell.x + dx, cell.y + dy, "Alive");
				if (cells.contains(neighbor)) {
					if(cell.x + dx < 0 || cell.x + dx >= squareLength || cell.y + dy < 0 || cell.y + dy >= squareLength){
						System.out.println(dx + " " + dy);
						throw new CustomLifeException("Tried to reach cell out of grid!");
					}				
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
