package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {

	private Grid testGrid = new Grid();
	
	//Initialization function
	public void initializeGrid ( int w, int h ) {
		testGrid = new Grid(w,h);
	}
	
	@Test
	public void test_createA10By10Grid () {
		initializeGrid ( 10, 10 );
		String size = testGrid.getSize();
		assertEquals(size, "10x10");
	}
	
	@Test
	public void test_createA50By43Grid () {
		initializeGrid ( 50, 43 );
		String size = testGrid.getSize();
		assertEquals(size, "50x43");
	}
	
	@Test
	public void test_getCellFromGrid () {
		initializeGrid ( 50, 50 );
		testGrid.getCell(10,10);
	}
	
	@Test
	public void test_getCellStatusFromGrid () {
		initializeGrid   ( 50, 50 );
		String str = testGrid.getCellStatus ( 20, 10 );
		if (str == "*" || str == "-") {
			assert(true);
		} else {
			fail("Life of a cell was not * or -.")
		}
	}
	
}
