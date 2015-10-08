package org.unioulu.tol.sqatlab.gameoflife;

import java.util.ArrayList;

public class Grid {

	private static ArrayList<Integer>[][] gridArray = new ArrayList[0][0];
	
	public Grid() {
		// ...
	}
	
	public Grid(int width, int height) {
		int i = 0;
		int b = 0;
		
		while ( i < width) {
			while ( b < height ) {
				gridArray[i][b].add(0);
				b++;
			}
			i++;
		}
		
	}
	
	public String getSize () {
		String str = gridArray.size() + "x" + gridArray[0].size()
		return 
	}
	
	
}
