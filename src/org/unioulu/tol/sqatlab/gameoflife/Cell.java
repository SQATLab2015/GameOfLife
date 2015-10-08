package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Random;

public class Cell {
	public int x;
	public int y;
	public int neighbour;
	public String state;
	
	public int getNeighbour() {
		return neighbour;
	}

	public void setNeighbour(int neighbour) {
		this.neighbour = neighbour;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void cell( int x, int y) {
	    this.x = x;
	    this.y = y;
	    neighbour = 0;
	    Random rand = new Random();
	    int randstate = rand.nextInt(1);
	    if (randstate == 0) {
	    	state= "-";
	    }
	    else if (randstate==1) {
	    	state = "*";
	    }
	}
	
	                         

}
