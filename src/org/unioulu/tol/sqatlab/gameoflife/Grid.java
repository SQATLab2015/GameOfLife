package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {

	private static int[][] gridArray = new int[0][0];
	
	public Grid() {
		// ...
	}
	
	public Grid(int width, int height) {
		gridArray = new int[width][height];
		int i = 0;
		int b = 0;
		
		while ( i < width) {
			while ( b < height ) {
				gridArray[i][b] = 0;
				b++;
			}
			i++;
		}
		
	}
	
	public String getSize () {
		String str = gridArray.length + "x" + gridArray[0].length;
		return str;
	}
	
	public int getCell (int x, int y) {
		return gridArray(x,y);
	}
	
}
