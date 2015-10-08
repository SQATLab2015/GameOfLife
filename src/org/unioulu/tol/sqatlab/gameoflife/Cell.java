package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	public String status;
	
	public Cell(String status) 
	{
		this.setStatus(status);
	}
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
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
