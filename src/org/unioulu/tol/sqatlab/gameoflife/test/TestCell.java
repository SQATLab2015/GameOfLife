package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	@Test
	public void testLiveCellWithNoNeighborsShouldDie() {
		//arrange
		Cell cell= new Cell("Alive");
		//
		cell.nextIteration(0);
		
		//assert
		assertEquals("Dead", cell.getState());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testLiveCellTwoNeighborsShouldLive() {
		//arrange
		Cell cell= new Cell("Alive");
		//
		cell.nextIteration(2);
		
		//assert
		assertEquals("Dead", cell.getState());
		fail("Not yet implemented");
	}
	

}
