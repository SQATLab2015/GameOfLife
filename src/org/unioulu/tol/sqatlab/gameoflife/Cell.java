package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	public String state;
	
	
	public Cell(String state) 
	{
		this.setState(state);
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
		if(aliveSurroundingCells==0)
		{
			state = "Dead";
		}
	}
}
