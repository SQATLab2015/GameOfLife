package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {

	@Test
	public void test() {
		Grid grid = new Grid();
		Cell cell = new Cell(0,0);
		
		int numNeighbors = grid.getNeighbors(cell);
	
		assertEquals(0, numNeighbors);
	}

}
