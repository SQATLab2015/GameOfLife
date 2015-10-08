package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Vector;

public class Grid {

	public static final int NEIGHBOR_STATE_LESS_THAN_TWO = 0;
	public static final int NEIGHBOR_STATE_TWO = 1;
	public static final int NEIGHBOR_STATE_THREE = 2;
	public static final int NEIGHBOR_STATE_MORE_THAN_THREE = 3;

	private int size;

	private Vector<Cell> grid;

	public Grid() {
		this.size = 10;

		initGrid(10);
	}

	public Grid(int size) {
		this.size = size;

		initGrid(size);
	}

	private void initGrid(int size) {
		int totalCells = size * size;

		for(int i = 0; i < totalCells; i++) {
			grid.add(new Cell());
		}
	}

	public int getSize() {

		return size;
	}

	public int checkCellNeighbors(int x, int y) {

		int id = y * size + x;
			
		int aliveNeighborCount = 0;
		
		//CHECK GRID BORDERS
		
		//CHECK TOP NEIGHBORS
		if(y > 0) {
			if(x > 0) {
				//NE neighbor
				id = (y-1) * size + (x-1);

				if(grid.get(id).getState() == Cell.CELL_STATE_ALIVE) {
					aliveNeighborCount++;
				}
			}
			
			id = (y-1) * size + x;
		}

		if(x == size-1) {
			//CELL AT RIGHT EDGE OF GRID
		}
		
		if(y == 0) {
			//CELL AT TOP EDGE OF GRID
		}
		
		if(y == size-1) {
			//CELL AT BOTTOM EDGE OF GRID
		}
		
		return 0;
	}

	public Cell getCell(int x, int y) {
		return grid.get(y * size + x);
	}
	
}
