package org.unioulu.tol.sqatlab.gameoflife;

public class GameOfLife {
	
	public static Grid grid;
	
	public static void main(String [] args)
	{
		grid = new Grid();
		grid.createGrid(5, 5);
	}
	
}
