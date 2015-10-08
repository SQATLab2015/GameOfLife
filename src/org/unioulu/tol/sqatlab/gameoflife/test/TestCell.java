package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	private Cell testCell = new Cell();
	
	//Initialization function
	public void initializeCell() {
		testCell = new Cell();
	}
	
	@Test
	public void test_getCellStatus () {
		initializeCell();
		String r = testCell.getStatus();
		assertEquals( ((Object)r).getClass().getName(),  "java.lang.String" );
	}
	
	@Test
	public void test_setToAliveAndReturnStatus() {
		initializeCell();
		testCell.setToAlive();
		String r = testCell.getStatus();
		assertEquals ( r, "*" );
	}
	
	@Test
	public void test_setToAliveAndThenToDeadAndReturnStatus() {
		initializeCell();
		testCell.setToAlive();
		testCell.setToDead();
		String r = testCell.getStatus();
		assertEquals ( r, "-" );
	}
	
	@Test
	//Test to make sure that the cell can get both dead and alive
	//status when it is created. Essentially, perform a while-
	//loop up until both statuses are recognized.
	public void test_randomCellStatusInitialization () {
		boolean dead  = false; 
		boolean alive = false;
		while ( dead == false && alive == false ) {
			initializeCell();
			if (testCell.getStatus() == "*") {
				alive = true;
			} else {
				dead = true;
			}
		}
	}

}
