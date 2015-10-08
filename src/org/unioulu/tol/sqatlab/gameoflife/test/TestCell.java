package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	@Test
	public void testGetCellState() {
		Cell cell = new Cell();
		
		int state = cell.getState();
		
		assertEquals(1, state);
	}

}
