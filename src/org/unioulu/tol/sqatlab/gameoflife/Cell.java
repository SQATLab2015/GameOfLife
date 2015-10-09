package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	String state;
	
	public Cell(String initialState) {
		this.state = initialState;
	}

	public void nextIteration(int numOfLiveCells) {
		if(state == "Alive" && numOfLiveCells < 2){
			state = "Dead";
		}else 
			state = "Alive";
	}

	public Object getState() {
		// TODO Auto-generated method stub
		
		return this.state;
	}

}
