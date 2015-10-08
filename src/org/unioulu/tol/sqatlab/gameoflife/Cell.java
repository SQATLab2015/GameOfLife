package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	
	//Initially start with dead status
	private boolean isAlive = false;
	
	public static void main () {
		if ( Math.random() < 0.5 ) {
			isAlive = false;
		} else {
			isAlive = true;
		}
	}
	
	public boolean getStatus () {
		return isAlive;
	}
	
	public void setToAlive () {
		isAlive = true;
	}
	
	public void setToDead () {
		isAlive = false;
	}

}
