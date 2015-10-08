package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	
	public boolean status;
	public int neighbours;
	public int col;
	public int row;
	
	public Cell (int col, int row, int neighbours, boolean status) {
		
		
		
	}
		
	public void update(int neighbours) {
		if (neighbours < 2) {
			setStatus(false);
		}
		else if (neighbours == 2 || neighbours == 3) {
			setStatus(true);	
		}
		else setStatus(false);
			
		
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void setNeighbours(int neighbours) {
		this.neighbours = neighbours;
		
	}

	public boolean isStatus() {
		return status;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	
	}
		

