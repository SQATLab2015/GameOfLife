package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Arrays;

public class Grid {

	private static Cell[][] gridArray = new Cell[0][0];
	
	public Grid() {
		// ...
	}
	
	public Grid(int width, int height) {
		Cell[][] gridArray = new Cell[width][height];

		Arrays.fill(gridArray,new Cell());
		
		
		gridArray = temp;
	}
	
	public String getSize () {
		String str = gridArray.length + "x" + gridArray[0].length;
		return str;
	}
	
	public Cell getCell (int x, int y) {
		return gridArray[x][y];
	}
	
	public String getCellStatus ( int x, int y ) {
		System.out.println(getCell(x,y));
		return getCell(x,y).getStatus();
	}
	
}
