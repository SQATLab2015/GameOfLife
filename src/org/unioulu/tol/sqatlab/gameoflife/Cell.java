package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	String state;
	int x;
	int y;
	
	public Cell(){
		
	}

	public Cell(String initialState) {
		this.state = initialState;
	}

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void nextIteration(int numOfLiveCells) {
		if (state == "Alive" && numOfLiveCells < 2){
			state = "Dead";
		}
		else{
			state = "Alive";
		}
	}

	public String getState() {
		// TODO Auto-generated method stub
		return this.state;
	}
	
}
