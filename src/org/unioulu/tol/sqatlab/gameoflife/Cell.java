package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	private String state = "Alive";
	public Cell(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
}

