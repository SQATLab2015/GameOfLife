package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {

	public static final int NEIGHBOR_STATE_LESS_THAN_TWO = 0;
	public static final int NEIGHBOR_STATE_TWO_OR_THREE = 1;
	
	private int size;
	
	public Grid() {
		this.size = 10;
	}
	
	public Grid(int size) {
		this.size = size;
	}

	public int getSize() {
		
		return size;
	}

	public int checkCell(int x, int y) {
		
		return 0;
	}

}
