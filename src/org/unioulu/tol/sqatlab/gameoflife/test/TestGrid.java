package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {
	
	Grid grid;
	
	
	@Before
	public void init()
	{
		grid = new Grid();
	}
	

	@Test
	public void testCreateGrid() 
	{
		grid = new Grid();
		
		int actual = grid.createGrid(5);

		assertEquals(5, actual);

	}
	
	@Test
	public void testGetStatusOfCell()
	{
		
	}

}
