package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	
	public boolean status;
	public int neighbours;
		
	public Cell(int neighbours) {
		if (neighbours == 0) {
			setStatus(false);
		}
			
		
	}
	
	public boolean cellIsDead() {
		status = false;
		return status;
	} 
	
	public boolean cellIsAlive() {
		status = true;
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void setNeighbours(int neighbours) {
		this.neighbours = neighbours;
		
	}
	
	public boolean getStatus (boolean status) {
		return status;
		
	}
	
	}
		

