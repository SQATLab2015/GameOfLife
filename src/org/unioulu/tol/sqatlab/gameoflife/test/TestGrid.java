package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {

	@Test
	public void testGetGritSizeShouldBe10by10() {
		Grid grid = new Grid();
		
		int size = grid.getSize();
		
		assertEquals(10, size);
	}
	
	@Test
	public void testCreateGridAtSize20by20() {
		Grid grid = new Grid(20);
		
		int size = grid.getSize();
		
		assertEquals(20, size);
	}

	@Test
	public void testCheckNeighborsExpectLessThanTwoAlive() {
		Grid grid = new Grid();
		
		int aliveNeighbors = grid.checkCellNeighbors(0,0);
		
		assertEquals(Grid.NEIGHBOR_STATE_LESS_THAN_TWO, aliveNeighbors);
	}
	
	@Test
	public void testCheckNeighborsExceptThreeAlive() {
		
	}
}
