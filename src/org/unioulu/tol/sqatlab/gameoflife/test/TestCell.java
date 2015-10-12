package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {
	
	private Cell aliveCell;
	private Cell deadCell;
	
	@Before
	public void setup(){
		aliveCell = new Cell("Alive", 0, 0);
		deadCell = new Cell("Dead", 0, 0);
	}

	@Test
	public void testLiveCellWithNoNeighborsShouldDie() {
		//arrange
		
		//
		aliveCell.nextIteration(0);
		//assert
		assertEquals("Dead", aliveCell.getState());	
	}

	@Test
	public void testLiveCellWithTwoNeighborsShouldLive() {
		//arrange
		
		//
		aliveCell.nextIteration(2);
		//assert
		assertEquals("Alive", aliveCell.getState());	
	}
	
	
}
