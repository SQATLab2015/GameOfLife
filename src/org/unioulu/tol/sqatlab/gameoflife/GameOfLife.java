package org.unioulu.tol.sqatlab.gameoflife;

public class GameOfLife {
	int numberOfCells;
	int squareLength;
	
	public GameOfLife(int squareLength){
		this.squareLength = squareLength;
		numberOfCells = squareLength * squareLength;
		
	}
}
