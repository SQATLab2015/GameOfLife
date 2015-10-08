package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	@Test
	public void testGetCellStateStateShouldBeDead() {
		Cell cell = new Cell();
		
		int state = cell.getState();
		
		assertEquals(Cell.CELL_STATE_DEAD, state);
	}
	
	@Test
	public void testSetCellStateToDead() {
		Cell cell = new Cell();
		
		cell.setState(Cell.CELL_STATE_DEAD);
		
		int state = cell.getState();
		
		assertEquals(Cell.CELL_STATE_DEAD, state);
	}

}
