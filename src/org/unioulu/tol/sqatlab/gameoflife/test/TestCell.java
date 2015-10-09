package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCell {

	@Test
	public void testLiveCellWithNoNeighborsShouldDie() {
		//arrange
		Cell cell = new Cell("Alive");
		//
		cell.nextIteration();
		
		//assert
		assertEquals("Dead", cell.getState());
	}

}
