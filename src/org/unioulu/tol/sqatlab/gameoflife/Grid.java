package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Arrays;

public class Grid {

	private static Cell[][] gridArray = new Cell[1][1];
	
	public Grid() {
		// ...
	}
	
	public Grid(int width, int height) {
		gridArray = new Cell[width][height];
		int i = 0;
		
		while ( i < width) {
			Arrays.fill(gridArray[i], new Cell());
			i++;
		}
		
	}
	
	public String getSize () {
		String str = gridArray.length + "x" + gridArray[0].length;
		return str;
	}
	
	public Cell getCell (int x, int y) {
		return gridArray[x][y];
	}
	
	public String getCellStatus ( int x, int y ) {
		return getCell(x,y).getStatus();
	}
	
}
