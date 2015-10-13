package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GameOfLife {
	public int numberOfCells;
	int squareLength;
	public Grid grid;
	
	public GameOfLife(int squareLength){
		this.squareLength = squareLength;
		numberOfCells = squareLength * squareLength;
		
	}

	public void setupGame(String[] states) {
		grid = new Grid(squareLength);		
		
		int counter = 0;
		for (int i = 0; i < squareLength; i++){
			for (int j = 0; j < squareLength; j++){
				Cell cell = new Cell(i, j, states[counter]);
				grid.addCell(cell);
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

	public String printCurrentGameState() throws CustomLifeException {
		String currentGameState = "";
		
		for (int i = 0; i < squareLength; i++){
			for (int j = 0; j < squareLength; j++){
				Cell cell1 = new Cell(i, j, "Alive");
				Cell cell2 = new Cell(i, j, "Dead");
				
				if(grid.cells.contains(cell1) && grid.cells.contains(cell2)){
					throw new CustomLifeException("Two cells at the same Coordinate!");
				}
				
				else if(grid.cells.contains(cell1)){
					currentGameState = currentGameState + "*";
				}
				else if(grid.cells.contains(cell2)){
					currentGameState = currentGameState + "-";
				}
				else{
					throw new CustomLifeException("Missing Cell!");
				}
			}
			currentGameState = currentGameState + "\n";
		}
		return currentGameState;
	}

	public void doOneRound() throws CustomLifeException {
		Set<Cell> newCells = new HashSet<>();

		for (int i = 0; i < squareLength; i++){
			for (int j = 0; j < squareLength; j++){
				Cell cell = new Cell(i, j, "Alive");
				//System.out.print("x: " + cell.getX() + " y: " + cell.getY() + " state: " + cell.getState());
				if(!(grid.cells.contains(cell))){
					cell.setState("Dead");
				}
				int amountOfAliveNeighbours = grid.getNumNeighbors(cell);
				cell.nextIteration(amountOfAliveNeighbours);				
				//System.out.println(" neighbours: " + amountOfAliveNeighbours  + "     x: " + cell.getX() + " y: " + cell.getY() + " state: " + cell.getState());
				newCells.add(cell);
			}
		}
		grid.cells.clear();
		grid.cells = newCells;
	}
	
	
}
