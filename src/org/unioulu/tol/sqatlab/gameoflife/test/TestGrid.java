package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {

	@Test
	public void testCreate() {
		Grid g = new Grid(5);
		g.getGrid()[1][1].setState("-");
		assertEquals("-", g.getGrid()[1][1].getState());
	}
	
	@Test
	public void testDisplay() {
		Grid g = new Grid(2);
		g.getGrid()[0][0].setState("-");
		g.getGrid()[0][1].setState("-");
		g.getGrid()[1][0].setState("-");
		g.getGrid()[1][1].setState("-");
		g.display();
		//assertEquals("-", g.getGrid()[1][1].getState());
	}
	
	@Test
	public void testCount() {
		Grid g = new Grid(2);
		g.getGrid()[0][0].setState("-");
		g.getGrid()[0][1].setState("-");
		g.getGrid()[1][0].setState("-");
		g.getGrid()[1][1].setState("-");
		assertEquals(0, g.count(0, 0));
	}

}
