package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	
	//Initially start with dead status
	private static String Life = "-";
	
	public Cell () {
		if ( Math.random() < 0.5 ) {
			Life = "-";
		} else {
			Life = "*";
		}
	}
	
	public String getStatus () {
		return Life;
	}
	
	public void setToAlive () {
		Life = "*";
	}
	
	public void setToDead () {
		Life = "-";
	}

}
