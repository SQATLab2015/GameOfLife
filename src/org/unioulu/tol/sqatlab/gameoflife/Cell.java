package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Random;

public class Cell {
	public int x;
	public int y;
	public int neighbour;
	public String state;

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
		neighbour = 0;
		Random rand = new Random();
		int randstate = rand.nextInt(1);
		if (randstate == 0) {
			state = "-";
		}
		else if (randstate == 1) {
			state = "*";
		}
		
	}
	
	public int getNeighbours() {
		return 0;
	}
}
