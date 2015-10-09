package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	String state;
	int x;
	int y;
	
	public Cell(){
		
	}

	public Cell(String initialState) {
		this.state = initialState;
	}

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	
	public void nextIteration(int numOfLiveCells) {
		if (state == "Dead" && numOfLiveCells == 3){
			state = "Alive";
		}
		else if (state == "Alive" && numOfLiveCells < 2){
			state = "Dead";
		}
		else if (state == "Alive" && numOfLiveCells > 3){
			state = "Dead";
		}
		else{
			state = "Alive";
		}
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public String getState() {
		// TODO Auto-generated method stub
		return this.state;
	}
	
}
