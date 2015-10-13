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
	
	@Test
	public void testCount2() {
		Grid g = new Grid(3);
		g.getGrid()[0][0].setState("*");
		g.getGrid()[0][1].setState("*");
		g.getGrid()[0][2].setState("*");
		g.getGrid()[1][0].setState("*");
		g.getGrid()[1][1].setState("-");
		g.getGrid()[1][2].setState("*");
		g.getGrid()[2][0].setState("*");
		g.getGrid()[2][1].setState("*");
		g.getGrid()[2][2].setState("*");
		assertEquals(8, g.count(1, 1));
		assertEquals(2, g.count(0, 0));
		assertEquals(4, g.count(0, 1));
		assertEquals(4, g.count(1, 0));
		assertEquals(4, g.count(2, 1));
		assertEquals(4, g.count(1, 2));
	}
	
	@Test
	public void testTick() {
		Grid g = new Grid(3);
		g.getGrid()[0][0].setState("*");
		g.getGrid()[0][1].setState("*");
		g.getGrid()[0][2].setState("*");
		g.getGrid()[1][0].setState("*");
		g.getGrid()[1][1].setState("-");
		g.getGrid()[1][2].setState("*");
		g.getGrid()[2][0].setState("*");
		g.getGrid()[2][1].setState("*");
		g.getGrid()[2][2].setState("*");
		g.display();
		g.tick();
		g.display();
		g.tick();
		g.display();
	}
	
}
