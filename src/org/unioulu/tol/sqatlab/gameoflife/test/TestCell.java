package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	@Test
	public void testLiveCellWithNoNeighborDies()
	{
		Cell cell = new Cell("Alive");
		cell.update(0);
		assertEquals("Dead", cell.getState());
	}
	
	@Test
	public void testLiveCellWithTwoNeighborLives()
	{
		Cell cell = new Cell("Alive");
		cell.update(2);
		assertEquals("Alive", cell.getState());
	}
}
