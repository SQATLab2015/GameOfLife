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
		boolean r = testCell.getStatus();
		assertEquals( ((Object)r).getClass().getName(),  "java.lang.Boolean" );
	}
	
	@Test
	public void test_setToAliveAndReturnStatus() {
		initializeCell();
		testCell.setToAlive();
		boolean r = testCell.getStatus();
		assertEquals ( r, true );
	}
	
	@Test
	public void test_setToAliveAndThenToDeadAndReturnStatus() {
		initializeCell();
		testCell.setToAlive();
		testCell.setToDead();
		boolean r = testCell.getStatus();
		assertEquals ( r, false );
	}

}
