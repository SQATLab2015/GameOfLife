package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Grid {
	public Set<Cell> cells;
	
	public Grid(){
		
		cells = new HashSet<>();
	}
	int triesToGetBalancedInitialGrid =1;
	
	public int getNumNeighbors(Cell cell) {
		int numNeighbors = 0;
	
		for (int dx=-1; dx<=1; dx ++) {
			for (int dy=-1; dy<=1; dy ++) {
				Cell neighbor = new Cell("Alive",cell.x + dx, cell.y + dy);
				if (cells.contains(neighbor)) {
					numNeighbors++;
				} 
			}
		}
		
		if(cell.getState().equals("Alive")){
			return numNeighbors-1;
		}
		return numNeighbors;
	}
	public void addCell(Cell cell) {
		cells.add(cell);		
	}


	public void fillGrid(int gridSize) {
		int counter = 0;
		cells.clear();
		Cell[] cellArray = new Cell[gridSize*gridSize];
		for(int i = 0; i < gridSize; i++){
			for(int j = 0; j < gridSize; j++){
				cellArray[counter] = new Cell(randomState(), i, j);
				addCell(cellArray[counter]);
				counter++;
			}
		}
		
		System.out.println(triesToGetBalancedInitialGrid);
		if(triesToGetBalancedInitialGrid>=10){
			System.out.println("Initial grid might be unbalanced");
			System.out.println("eins");
		}
		else if(checkPercentageOfAliveCells() && triesToGetBalancedInitialGrid<10){
			triesToGetBalancedInitialGrid++;
			fillGrid(gridSize);
			System.out.println("zwei");
		}
		System.out.println("end method");
	}


	public int getNumAliveCells() {
		int numAliveCells = 0;
		
		for(int i = 0; i < cells.size(); i++){
			for(int j = 0; j < cells.size(); j++){
				Cell aliveCell = new Cell("Alive", i, j);
				if (cells.contains(aliveCell)) 
					numAliveCells++;
			}
		}
		return numAliveCells;
	}


	public boolean checkPercentageOfAliveCells() {
		double percentageOfAliveCells = 0;
		percentageOfAliveCells = getNumAliveCells()*100/cells.size();
		//System.out.println(getNumAliveCells() + " " + cells.size() + " = " + percentageOfAliveCells);
		if(percentageOfAliveCells>70 || percentageOfAliveCells<30)return false;
		else return true;
	}
	public String randomState(){
		String randomState = "";
		double randomNumber = Math.floor((Math.random() * 100) + 1);
		if(randomNumber<50){
		randomState = "Alive";
		}else{
			randomState ="Dead";
		}
		return randomState;
	}

}
