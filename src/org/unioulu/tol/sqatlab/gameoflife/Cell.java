package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	String state;
	int x;
	int y;
	
	public Cell(String initialState) {
		this.state = initialState;
	}

	public Cell(int i, int j) {
		this.x = i;
		this.y = j;
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
