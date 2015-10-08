package org.unioulu.tol.sqatlab.gameoflife;

import java.util.ArrayList;

public class Grid {

	private static List<Integer>[][] gridArray = new ArrayList[0][0];
	
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
	
	
}
