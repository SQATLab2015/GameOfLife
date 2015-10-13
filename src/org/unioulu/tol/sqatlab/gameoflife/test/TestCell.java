package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	@Test
	public void testLiveCellWithNoNeighborsShouldDie() {
		//arrange
		Cell cell = new Cell(0, 0, "Alive");
		//
		cell.nextIteration(0);
		//assert
		assertEquals("Dead", cell.getState());	
	}

	@Test
	public void testLiveCellWithTwoNeighborsShouldLive() {
		//arrange
		Cell cell = new Cell(0, 0, "Alive");
		//
		cell.nextIteration(2);
		//assert
		assertEquals("Alive", cell.getState());	
	}
	
	@Test
	public void testLiveCellWithFourNeighborsShouldDie() {
		//arrange
		Cell cell = new Cell(0, 0, "Alive");
		//
		cell.nextIteration(4);
		//assert
		assertEquals("Dead", cell.getState());	
	}
	
	@Test
	public void testDeadCellWithThreeNeighborsShouldLive() {
		//arrange
		Cell cell = new Cell(0, 0, "Dead");
		//
		cell.nextIteration(3);
		//assert
		assertEquals("Alive", cell.getState());	
	}
	
	@Test
	public void testEqualsLiveCellAndSameCell_ReturnTrue() {
		//arrange
		Cell cell1 = new Cell(0, 0, "Alive");
		Cell cell2 = new Cell(0, 0, "Alive");

		//assert
		assertEquals(true, cell1.equals(cell2));	
	}
	
	@Test
	public void testEqualsLiveCellAndDeadCell_ReturnFalse() {
		//arrange
		Cell cell1 = new Cell(0, 0, "Alive");
		Cell cell2 = new Cell(0, 0, "Dead");

		//assert
		assertEquals(false, cell1.equals(cell2));	
	}
	
	@Test
	public void testEqualsDifferentCoordinates_ReturnFalse() {
		//arrange
		Cell cell1 = new Cell(0, 0, "Alive");
		Cell cell2 = new Cell(0, 1, "Dead");

		//assert
		assertEquals(false, cell1.equals(cell2));	
	}
}
