package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {
	//GRID X * Y 
	int gridSize=8;
	
	public int[][]array = new int [gridSize][gridSize];

	
	
	
	public int getArray(){
		int a= array.length;
		return a;
	}

}

