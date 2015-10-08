package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Grid;


public class TestGrid {

	@Test
	public void testIsGridSameAmountColumsAndRows() {
		//getRows x GetColumns == getRows x GetRows
		//compares 8 to set gridSize in Grid.java
		 assertEquals(7,Grid.getArray());
		
		
	}
	
	@Test
	public void testDoesArrayOnlyIncludeAliveorDeadMarks(){
		//The state of the grid is called “Life” and shall be represented as a
		//string, where dead cells are represented with a “-” (dash) and alive
		//cells are represented with a “*” (star) character.
		
		
	}

}
