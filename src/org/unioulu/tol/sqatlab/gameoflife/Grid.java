package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {
	Cell zelle = new Cell();
	public Cell[][] grid = new Cell[9][9];
	
	public void start() {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid.length; j++) {
				zelle.cell(i,j);
			}
		}
	}
	
	public void neighboursetting(int x, int y){
		int temp = 0;
		if (grid[x-1][y-1].getState() == "*") {
			temp++;
		}
		if (grid[x][y-1].getState() == "*") {
			temp++;
		}
		if (grid[x+1][y-1].getState() == "*") {
			temp++;
		}
		if (grid[x-1][y].getState() == "*") {
			temp++;
		}
		if (grid[x+1][y].getState() == "*") {
			temp++;
		}
		if (grid[x-1][y+1].getState() == "*") {
			temp++;
		}
		if (grid[x][y+1].getState() == "*") {
			temp++;
		}
		if (grid[x+1][y+1].getState() == "*") {
			temp++;
		}
		grid[x][y].setNeighbour(temp);
		
			
	}

	public void update() {
		
	}
}
