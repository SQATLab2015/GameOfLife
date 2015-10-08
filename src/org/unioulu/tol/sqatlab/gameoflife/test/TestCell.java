package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {
	
	Cell cell;
	
	@Before
	public void init()
	{
		cell = new Cell();
	}
	
	@Test
	public void getStateOfCell()
	{
		String actual = cell.getState();
		
		assertEquals("Dead", actual);
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
