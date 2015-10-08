package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {
	
	public Cell cell;
	
	@Before
	public void init()
	{
		Cell cell = new Cell("Alive");
	}

	@Test
	public void testLiveCellWithNoNeighborDies()
	{
		cell.update(0);
		assertEquals("Dead", cell.getState());
	}
	
	@Test
	public void testLiveCellWithTwoNeighborLives()
	{
		cell.update(2);
		assertEquals("Alive", cell.getState());
	}
}
