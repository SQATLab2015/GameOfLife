package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {
	private Cell[][] grid;
	
	public Cell[][] getGrid() {
		return grid;
	}

	public void setGrid(Cell[][] grid) {
		this.grid = grid;
	}

	public Grid(int i) {
		this.grid = new Cell[i][i];
	}
	
}
