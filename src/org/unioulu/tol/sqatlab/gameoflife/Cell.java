package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	String state;
	int x;
	int y;
	
	public Cell(String initialState) {
		this.state = initialState;
	}

	public Cell(int i, int j) {
		this.x = i;
		this.y = j;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}

	public void nextIteration(int numOfLiveCells) {
		if(state == "Alive" && numOfLiveCells < 2){
			state = "Dead";
		}else 
			state = "Alive";
	}

	public Object getState() {
		// TODO Auto-generated method stub
		
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
		return true;
	}

}
