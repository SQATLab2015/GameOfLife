package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {
	private Cell[][] grid;
	private int size;
	
	public Cell[][] getGrid() {
		return grid;
	}

	public void setGrid(Cell[][] grid) {
		this.grid = grid;
	}

	public Grid(int n) {
		this.size = n;
		this.grid = new Cell[n][n];
		int i = 0, j = 0;
		for (; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				grid[i][j] = new Cell("");
			}
		}
	}

	public void display() {
		int i = 0, j = 0;
		for (; i < size; i++)
		{
			for (j = 0; j < size; j++)
			{
				System.out.print(grid[i][j].getState());
			}
			System.out.println();
		}
	}
}
