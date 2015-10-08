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
	}

}
