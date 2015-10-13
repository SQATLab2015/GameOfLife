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
	
	@Test
	public void testGetNumNeighborsDifferentCells_ReturnDifferentAmounts() throws CustomLifeException {
		//arrange
		Grid grid = new Grid(3);
		
		Cell cell1 = new Cell(0,0, "Alive");
		Cell cell2 = new Cell(0,1, "Alive");
		Cell cell3 = new Cell(0,2, "Alive");
		Cell cell4 = new Cell(1,0, "Alive");
		Cell cell5 = new Cell(1,1, "Alive");
		Cell cell6 = new Cell(1,2, "Alive");
		Cell cell7 = new Cell(2,0, "Alive");
		Cell cell8 = new Cell(2,1, "Alive");
		Cell cell9 = new Cell(2,2, "Alive");
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		grid.addCell(cell3);
		grid.addCell(cell4);
		grid.addCell(cell5);
		grid.addCell(cell6);
		grid.addCell(cell7);
		grid.addCell(cell8);
		grid.addCell(cell9);
		
		assertEquals(3, grid.getNumNeighbors(cell1));
		assertEquals(3, grid.getNumNeighbors(cell2));
		assertEquals(3, grid.getNumNeighbors(cell3));
		assertEquals(3, grid.getNumNeighbors(cell4));
		assertEquals(3, grid.getNumNeighbors(cell5));
		assertEquals(3, grid.getNumNeighbors(cell6));
		assertEquals(3, grid.getNumNeighbors(cell7));
		assertEquals(3, grid.getNumNeighbors(cell8));
		assertEquals(3, grid.getNumNeighbors(cell9));
	}
}
