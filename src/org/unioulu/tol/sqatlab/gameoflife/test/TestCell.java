package org.unioulu.tol.sqatlab.gameoflife.test;


import static org.junit.Assert.*;
import org.unioulu.tol.sqatlab.gameoflife.*;
import org.junit.Before;
import org.junit.Test;

public class TestCell {
	
	private Cell testCell;

	@Before
	public void setup() {
		testCell = new Cell();	
		
	}
	

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void TestCellIsDead() {
		testCell.cellIsDead();
		assertEquals(false, testCell.cellIsDead());	
	}
	
	@Test
	public void TestCellIsAlive() {
		testCell.cellIsAlive();
		assertEquals(true, testCell.cellIsAlive());			
	}
	
	@Test
	public void TestCellWithNoNeighboursDies() {
		testCell.update(0);
		assertEquals(false, testCell.isStatus());
		
	}
	
	@Test 
	public void TestCellWithTwoNeighboursLives() {
		testCell.update(2);
		assertEquals(true, testCell.isStatus());
		
	}
	


}
