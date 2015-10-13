package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {

	@Test
	public void testCreatGrid() {
		Grid g = new Grid(5);
		g.getGrid()[1][1].setState("-");
		assertEquals("-", g.getGrid()[1][1].getState());
	}

}
