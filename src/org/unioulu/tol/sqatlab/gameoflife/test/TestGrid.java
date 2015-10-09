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
		int numNeighbors = grid.getNumNeighbors(cell);
		//assert
		assertEquals(0, numNeighbors);
	}

	@Test
	public void testSingleCellOnGridHasOneNeighbor() {
		//arrange
		Grid grid = new Grid();
		Cell cell1 = new Cell(0,0);
		Cell cell2 = new Cell(0,1);
		//act
		grid.addCell(cell1);
		grid.addCell(cell2);
		int numNeighbors = grid.getNumNeighbors(cell1);
		//assert
		assertEquals(1, numNeighbors);
	}
	
	@Test
	public void testTwoCellsOnGridHasOneNeighbor() {
		//arrange
		Grid grid = new Grid();
		Cell cell1 = new Cell(0,0);
		Cell cell2 = new Cell(0,1);
		//act
		grid.addCell(cell1);
		grid.addCell(cell2);
		int numNeighbors = grid.getNumNeighbors(cell1);
		//assert
		assertEquals(1, numNeighbors);
	}
	
	@Test
	public void testTwoSeparateCellsOnGridHasNoNeighbors() {
		//arrange
		Grid grid = new Grid();
		Cell cell1 = new Cell(0,0);
		Cell cell2 = new Cell(0,2);
		//act
		grid.addCell(cell1);
		grid.addCell(cell2);
		int numNeighbors1 = grid.getNumNeighbors(cell1);
		int numNeighbors2 = grid.getNumNeighbors(cell2);
		//assert
		assertEquals(0, numNeighbors1);
		assertEquals(0, numNeighbors2);
	}
	
	@Test
	public void testSingleCellWithThreeNeighborsShouldDie() {
		Grid grid = new Grid();
		Cell cell1 = new Cell(0,0);
		Cell cell2 = new Cell(0,2);
		Cell cell3 = new Cell(1,0);
		//act
		grid.addCell(cell1);
		grid.addCell(cell2);
		grid.addCell(cell3);
		
		int numNeighbors = grid.getNumNeighbors(cell1);
		
		assertEquals(0, numNeighbors1);
	}
	
	
	
}
