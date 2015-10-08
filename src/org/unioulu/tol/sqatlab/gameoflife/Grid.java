package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {

	private static Cell[][] gridArray = new Cell[0][0];
	
	public Grid() {
		// ...
	}
	
	public Grid(int width, int height) {
		Cell[][] temp = new Cell[width][height];
		int i = 0;
		int b = 0;
		
		while ( i < width) {
			while ( b < height ) {
				temp[i][b] = new Cell();
				b++;
			}
			i++;
		}
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
		return getCell(x,y).getStatus();
	}
	
}
