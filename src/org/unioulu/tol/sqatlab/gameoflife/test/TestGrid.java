package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

import java.util.HashSet;
import java.util.Set;


public class TestGrid {

	@Test
	public void testSingleCellOnGridHasNoNeighbors() {
		//arrange
		Grid grid = new Grid();
		Cell cell = new Cell("Alive",0,0);
		
		grid.addCell(cell);
		
		int numNeighbors = grid.getNumNeighbors(cell);
		
		assertEquals(0, numNeighbors);	
	}
	
	@Test
	public void testTwoNeighborCellsShouldHaveOneNeigbor() {
		//arrange
		Grid grid = new Grid();
		Cell cell1 = new Cell("Alive",0,0);
		Cell cell2 = new Cell("Alive",0,1);
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		
		int numNeighbors = grid.getNumNeighbors(cell1);
		assertEquals(1, numNeighbors);
		
	}
	
	
	@Test
	public void testTwoNeighborCellsOnDifferentRowsShouldHaveOneNeigbor() {
		//arrange
		Grid grid = new Grid();
		Cell cell1 = new Cell("Alive",0,0);
		Cell cell2 = new Cell("Alive",1,0);
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		
		int numNeighbors = grid.getNumNeighbors(cell1);
		assertEquals(1, numNeighbors);
		
	}
	
	@Test
	public void testFillGridWithIsEmpty_ReturnFalse(){
		//arrange
		Grid grid = new Grid();
		int gridSize = 2;
		
		grid.fillGrid(gridSize);
		
		assertEquals(false, grid.isEmpty());
	}

}
