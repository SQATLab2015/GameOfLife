package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	public static final int CELL_STATE_DEAD = 0;
	public static final int CELL_STATE_ALIVE = 1;
	
	private int state;
	
	public Cell() {
		super();
		this.state = CELL_STATE_DEAD;
	}

	public int getState() {
		
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
