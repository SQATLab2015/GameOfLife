package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {
	Cell cell = new Cell();

	@Test
	public void testLiveCellsWithNoNeighboursDies() {
		Cell cell= new Cell("Alive");
		cell.update(0);
		assertEquals.("Dead", cell.getState())
		
		
		fail("Not yet implemented");
	}

}
