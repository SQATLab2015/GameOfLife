package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {

	@Test
	public void testSingleCellOnGridHasNoNeighbors() {
		//arrange
		Grid grid = new Grid();
		Cell cell = new Cell(0,0);
		//act
		grid.addCell(cell);
		int numNeighbors = grid.getNeighbors(cell);
		//assert
		assertEquals(0, numNeighbors);
	}

	@Test
	public void testSingleCellOnGridHasNoNeighbors() {
		//arrange
		Grid grid = new Grid();
		Cell cell1 = new Cell(0,0);
		Cell cell2 = new Cell(0,1);
		//act
		grid.addCell(cell1);
		grid.addCell(cell2);
		int numNeighbors = grid.getNeighbors(cell1);
		//assert
		assertEquals(1, numNeighbors);
	}
}
