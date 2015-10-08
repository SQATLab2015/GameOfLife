package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {
	
	int size;
	Cell [][] grid;
	int columns;
	int rows;
	
	public Grid(int size) {
		columns = size;
		rows = size;
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Cell[][] getGrid() {
		return grid;
	}

	public void setGrid(Cell[][] grid) {
		this.grid = grid;
	}
	

}
