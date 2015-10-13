package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Random;

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
		String[] states = createRandomStates(numberOfCells);
		
		
		int counter = 0;
		for (int i = 0; i < squareLength; i++){
			for (int j = 0; j < squareLength; j++){
				Cell cell = new Cell(i, j, states[counter]);
				counter++;
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

	public String[] createRandomStates(int numberOfCells2) {
		String[] states = new String[numberOfCells2];
		
		for(int i = 0; i < states.length; i++)
		{
			Random random = new Random();
			if(random.nextBoolean()){
				states[i] = "Alive";
			}
			else{
				states[i] = "Dead";
			}
		}
		
		return states;
	}
	
	
}
