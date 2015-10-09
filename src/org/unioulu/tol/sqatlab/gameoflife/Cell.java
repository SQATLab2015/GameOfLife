package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	String state;
	int x;
	int y;
	
	public Cell(String initialState) {
		this.state = initialState;
	}

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void nextIteration(int numberOfLiveCells) {
		if (state.equals("Alive") && numberOfLiveCells < 2){
			state = "Dead";
		}else{
			state = "Alive";
		}
	}

	public String getState() {
		return this.state;
	}

}
