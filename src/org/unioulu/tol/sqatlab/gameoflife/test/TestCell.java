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
	public void TestCellWithNoNeighboursDies() {
		testCell.update(0);
		assertEquals(false, testCell.isStatus());	
	}
	
	@Test
	public void TestCellWithLessThanTwoNeighboursDies() {
		testCell.update(1);
		assertEquals(false, testCell.isStatus());	
	}
	
	@Test 
	public void TestCellWithTwoNeighboursLives() {
		testCell.update(2);
		assertEquals(true, testCell.isStatus());
	}
	
	@Test
	public void TestCellWithThreeNeighboursLives() {
		testCell.update(3);
		assertEquals(true, testCell.isStatus());	
	}
	
	@Test
	public void TestCellWithMoreThanThreeNeighboursDies() {
		testCell.update(5);
		assertEquals(false, testCell.isStatus());	
	}
	
	
	


}
