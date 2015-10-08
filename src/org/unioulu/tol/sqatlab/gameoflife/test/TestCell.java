package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	private Cell testCell = new Cell();
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//Initialization functions
	public void initializeCell() {
		testCell = new Cell();
	}
	
	@Test
	public void test_isCellAlive () {
		initializeCell();
	}

}
