package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {
	public int[][] grid = new int[9][9];
	
	public void start() {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid.length; j++) {
				Cell(i,j);
			}
		}
	}

	public void update() {
		
	}
}
