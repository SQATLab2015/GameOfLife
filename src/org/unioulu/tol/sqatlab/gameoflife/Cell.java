package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Cell(String s)
	{
		this.state = s;
	}
}
