package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {
	
	Grid grid;

	@Test
	public void testCreateGrid() 
	{
		
		grid = new Grid(5, 5);
		
		int actual = grid.createGrid(5);
	
		assertEquals(5, actual);
		
		
	}

}
