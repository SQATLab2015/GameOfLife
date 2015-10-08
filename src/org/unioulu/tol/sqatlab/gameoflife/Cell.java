package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	public String status;
	
	public Cell(String string) {
		this.status = string;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setName(String status) {
		this.status = status;
	}
	
	
	
	public void update(int aliveSurroundingCells)
	{
		if(aliveSurroundingCells==0)
		{
			status = "Dead";
		}
	}
}
