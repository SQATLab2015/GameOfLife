package org.unioulu.tol.sqatlab.gameoflife;

public class GameOfLife {
	int numberOfCells;
	int squareLength;
	public Grid grid;
	
	public GameOfLife(int squareLength){
		this.squareLength = squareLength;
		numberOfCells = squareLength * squareLength;
		
	}

	public void setupGame() {
		grid = new Grid(squareLength);
		String[] states = new String
		
		for (int i = 0; i < squareLength; i++){
			for (int j = 0; j < squareLength; j++){
				Cell cell = new Cell(x, y, );
			}
		}
		
	}

	public int getNumberOfCells() {
		return numberOfCells;
	}

	public void setNumberOfCells(int numberOfCells) {
		this.numberOfCells = numberOfCells;
	}

	public int getSquareLength() {
		return squareLength;
	}

	public void setSquareLength(int squareLength) {
		this.squareLength = squareLength;
	}

	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}
	
	
}
