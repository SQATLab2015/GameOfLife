package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	String state;
	int x;
	int y;
	
	public Cell(int x, int y, String initialState) {
		this.x = x;
		this.y = y;
		this.state = initialState;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void nextIteration(int numOfLiveCells) {
		// Rule 1.
		if (state == "Alive" && numOfLiveCells < 2){
			state = "Dead";
		}
		// Rule 2
		if(state == "Alive" && numOfLiveCells == 2)
		{
			state = "Alive";
		}
		// Rule 3.
		else if(state == "Alive" && numOfLiveCells > 3){
			state = "Dead";
		}
		// Rule 4.
		else if(state == "Dead" && numOfLiveCells == 3){
			state = "Alive";
		}
	}

	public Object getState() {
		return this.state;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		if(!state.equals(other.state))
			return false;
		return true;
	}
}
