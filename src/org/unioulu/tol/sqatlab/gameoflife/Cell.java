package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	public String state;
	
	
	public Cell(String state) 
	{
		this.setState("Alive");
	}
	
	public String getState() 
	{
		return state;
	}
	
	public void setState(String state) 
	{
		this.state = state;
	}
	
	
	
	public void update(int aliveSurroundingCells)
	{
		if(aliveSurroundingCells<2)
		{
			state = "Dead";
		}
		
		if(aliveSurroundingCells>=2)
		{
			state = "Alive";
		}
	}
}
