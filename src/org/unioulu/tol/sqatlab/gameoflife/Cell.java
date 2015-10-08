package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	public int collum;
	public int row;
	public int neighbor;

	public Cell(int collum, int row) {
		this.collum = collum;
		this.row = row;
		neighbor = 0;
	}
}
