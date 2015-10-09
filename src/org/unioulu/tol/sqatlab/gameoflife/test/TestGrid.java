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
		
		grid.addCell(cell);
		
		int numNeighbors = grid.getNumNeighbors(cell);
		
		assertEquals(0, numNeighbors);	
	}
	
	@Test
	public void testTwoNeighborCellsShouldHaveOneNeigbor() {
		//arrange
		Grid grid = new Grid();
		Cell cell1 = new Cell(0,0);
		Cell cell2 = new Cell(0,1);
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		
		int numNeighbors = grid.getNumNeighbors(cell1);
		assertEquals(1, numNeighbors);
		
	}
	
	@Test
	public void testTwoNeighborCellsOnDifferentRowsShouldHaveOneNeigbor() {
		//arrange
		Grid grid = new Grid();
		Cell cell1 = new Cell(0,0);
		Cell cell2 = new Cell(1,0);
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		
		int numNeighbors = grid.getNumNeighbors(cell1);
		assertEquals(1, numNeighbors);
		
	}
	

}
