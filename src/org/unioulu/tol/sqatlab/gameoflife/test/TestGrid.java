package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;
import org.unioulu.tol.sqatlab.gameoflife.CustomLifeException;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {

	@Test
	public void testSingleCellOnGridHasNoNeighbors() throws CustomLifeException {
		//arrange
		Grid grid = new Grid(2);
		Cell cell = new Cell(0, 0, "Alive");
		
		grid.addCell(cell);
		
		int numNeighbors = grid.getNumNeighbors(cell);
		
		assertEquals(0, numNeighbors);	
	}
	
	@Test
	public void testTwoNeighborCellsShouldHaveOneNeigbor() throws CustomLifeException {
		//arrange
		Grid grid = new Grid(2);
		Cell cell1 = new Cell(0,0, "Alive");
		Cell cell2 = new Cell(0,1, "Alive");
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		
		int numNeighbors = grid.getNumNeighbors(cell1);
		assertEquals(1, numNeighbors);
		
	}
	
	@Test
	public void testTwoNeighborCellsOnDifferentRowsShouldHaveOneNeigbor() throws CustomLifeException {
		//arrange
		Grid grid = new Grid(2);
		Cell cell1 = new Cell(0, 0, "Alive");
		Cell cell2 = new Cell(1, 0, "Alive");
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		
		int numNeighbors = grid.getNumNeighbors(cell1);
		assertEquals(1, numNeighbors);
		
	}
	
	@Test
	public void testGetNumNeighborsCellZeroZero_FourAliveCells_ReturnThree() throws CustomLifeException {
		//arrange
		Grid grid = new Grid(2);
		Cell cell1 = new Cell(0,0, "Alive");
		Cell cell2 = new Cell(0,1, "Alive");
		Cell cell3 = new Cell(1,0, "Alive");
		Cell cell4 = new Cell(1,1, "Alive");
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		grid.addCell(cell3);
		grid.addCell(cell4);
		
		int numNeighbors = grid.getNumNeighbors(cell1);
		assertEquals(3, numNeighbors);	
	}
}
