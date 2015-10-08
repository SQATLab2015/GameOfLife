package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	
	public boolean status;
	
	
	public boolean cellIsDead() {
		status = false;
		return status;
	} 
	
	public boolean cellIsAlive() {
		status = true;
		return status;
	}
	
	}
		

