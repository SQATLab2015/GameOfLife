package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {
	//GRID X * Y 
	static int gridSize=8;
	
	public static String[][]array = new String [gridSize][gridSize];

	
	
	
public static int getArray(){ 
	// gets the row count of the array
	 int a =	array.length;
	 return a;
	}

}

