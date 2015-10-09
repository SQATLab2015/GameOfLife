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
	
	public static void main(String[] args) {
		Grid g = new Grid(5);
		g.getGrid()[1][1].setState("*");
		//System.out.println(g.getGrid()[1][1].getState());
	}
}
