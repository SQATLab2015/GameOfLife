package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	
	//Initially start with dead status
	private boolean isAlive = false;
	
	public boolean getStatus () {
		return isAlive;
	}
	
	public void setToAlive () {
		isAlive = true;
	}

}
