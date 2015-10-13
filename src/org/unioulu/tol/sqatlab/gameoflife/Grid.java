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
		for (int dx=-1; dx<=1; dx ++) {
			for (int dy=-1; dy<=1; dy ++) {
				Cell neighbor = new Cell(cell.x + dx, cell.y + dy, "Alive");
				if (cells.contains(neighbor)) {
					if(dx < 0 || dx >= squareLength || dy < 0 || dy >= squareLength){
						//cell out of grid);
					}
					else{
						numNeighbors++;
					}
					System.out.println(dx + " " + dy);
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
