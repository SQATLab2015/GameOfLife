package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	String state;
	
	public Cell(String initialState) {
		this.state = initialState;
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
