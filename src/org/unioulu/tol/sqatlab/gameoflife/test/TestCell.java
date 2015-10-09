package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	@Test
	public void testLiveCellWithNoNeighborsShouldDie() {
		Cell cell = new Cell("Alive");
		
		cell.nextIteration(0);
		
		assertEquals("Dead", cell.getState());
	}
	
	@Test
	public void testLiveCellWithTwoNeighborsShouldLive() {
		Cell cell = new Cell("Alive");
		
		cell.nextIteration(2);
		
		assertEquals("Alive", cell.getState());
	}

}
