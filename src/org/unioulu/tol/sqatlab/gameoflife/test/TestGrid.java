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
		
		assertEquals(false, grid.cells.isEmpty());
	}
	
	@Test
	public void testSizeOfTheWholeGrid_gridSize2_returns4(){
		Grid grid = new Grid();
		int gridSize = 2;
		
		grid.fillGrid(gridSize);
		System.out.println(gridSize);
		assertEquals(4, grid.cells.size());
	}
	
	@Test
	public void testCountAliveCellsinGrid(){
		Grid grid = new Grid();
		Cell cell1 = new Cell("Dead",0,0);
		Cell cell2 = new Cell("Alive",1,0);
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		
		int aliveCells = grid.getNumAliveCells();
		assertEquals(1, aliveCells);
	}
	@Test
	public void testCheckPercentageOfAliveCells_GridWithOnlyAliveCells_returnFalse(){
		Grid grid = new Grid();
		Cell cell1 = new Cell("Alive",0,0);
		Cell cell2 = new Cell("Alive",1,0);
		Cell cell3 = new Cell("Alive",0,1);
		Cell cell4 = new Cell("Alive",1,1);
		Cell cell5 = new Cell("Alive",2,0);
		Cell cell6 = new Cell("Alive",0,2);
		Cell cell7 = new Cell("Alive",1,2);
		Cell cell8 = new Cell("Alive",2,1);
		Cell cell9 = new Cell("Alive",2,2);		
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		grid.addCell(cell3);
		grid.addCell(cell4);
		grid.addCell(cell5);
		grid.addCell(cell6);
		grid.addCell(cell7);
		grid.addCell(cell8);
		grid.addCell(cell9);
		
		
		assertEquals(false, grid.checkPercentageOfAliveCells());
	
	}
	@Test
	public void testCheckPercentageOfAliveCells_GridWithOnlyDeadCells_returnFalse(){
		Grid grid = new Grid();
		Cell cell1 = new Cell("Dead",0,0);
		Cell cell2 = new Cell("Dead",1,0);
		Cell cell3 = new Cell("Dead",0,1);
		Cell cell4 = new Cell("Dead",1,1);
		Cell cell5 = new Cell("Dead",2,0);
		Cell cell6 = new Cell("Dead",0,2);
		Cell cell7 = new Cell("Dead",1,2);
		Cell cell8 = new Cell("Dead",2,1);
		Cell cell9 = new Cell("Dead",2,2);		
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		grid.addCell(cell3);
		grid.addCell(cell4);
		grid.addCell(cell5);
		grid.addCell(cell6);
		grid.addCell(cell7);
		grid.addCell(cell8);
		grid.addCell(cell9);
		
		
		assertEquals(false, grid.checkPercentageOfAliveCells());
	
	}
	@Test
	public void testCheckPercentageOfAliveCells_GridWith5Dead4AliveCells_returnTrue(){
		Grid grid = new Grid();
		Cell cell1 = new Cell("Dead",0,0);
		Cell cell2 = new Cell("Dead",1,0);
		Cell cell3 = new Cell("Dead",0,1);
		Cell cell4 = new Cell("Dead",1,1);
		Cell cell5 = new Cell("Dead",2,0);
		Cell cell6 = new Cell("Alive",0,2);
		Cell cell7 = new Cell("Alive",1,2);
		Cell cell8 = new Cell("Alive",2,1);
		Cell cell9 = new Cell("Alive",2,2);		
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		grid.addCell(cell3);
		grid.addCell(cell4);
		grid.addCell(cell5);
		grid.addCell(cell6);
		grid.addCell(cell7);
		grid.addCell(cell8);
		grid.addCell(cell9);
		
		
		assertEquals(true, grid.checkPercentageOfAliveCells());
	
	}

}
