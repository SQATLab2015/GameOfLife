package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Grid;


public class TestGrid {

	@Test
	public void testIsGridSameAmountColumsAndRows() {
		//getRows x GetColumns == getRows x GetRows
		//compares 8 to set gridSize in Grid.java
		 assertEquals(8,Grid.getArrayLenght());
		
		
	}
	
	@Test
	public void testDoesArrayOnlyIncludeAliveorDeadMarks(){
	//does array only include * and - 
		
		assertEquals(true,getMarks());
		
		
	}

	private Object getMarks() {
		//Array to string list
		//check if only * and - then return true
		Grid.setCharacters();
	if (Grid.getArrayAsList().matches("*-")){
		return true;
	} else return false;
		
	}

}
