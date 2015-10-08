package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {

	public static final int NEIGHBOR_STATE_LESS_THAN_TWO = 0;
	public static final int NEIGHBOR_STATE_TWO = 1;
	public static final int NEIGHBOR_STATE_THREE = 2;
	public static final int NEIGHBOR_STATE_MORE_THAN_THREE = 3;
	
	private int size;
	
	private int life[][]M
	
	public Grid() {
		this.size = 10;
	}
	
	public Grid(int size) {
		this.size = size;
	}

	public int getSize() {
		
		return size;
	}

	public int checkCellNeighbors(int x, int y) {
		
		return 0;
	}

}
