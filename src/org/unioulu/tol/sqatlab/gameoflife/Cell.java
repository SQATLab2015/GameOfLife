package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	private String state = "Alive";
	public Cell(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	public void update(int i) {
		if(i<=1){
			this.state = "Dead";
		}else{
			this.state = "Alive";
		}
		
	}
}

