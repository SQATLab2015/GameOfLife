package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.GameOfLife;

public class TestGameOfLife {
	GameOfLife gameOfLife;
	
	@Test
	public void testSetupGame() {
		gameOfLife = new GameOfLife(3);
		gameOfLife.setupGame();
		int numberOfCells = gameOfLife.grid.cells.size();
		
		assertEquals(9, numberOfCells);
	}
	
	//nextRound
	
	//output string
	
}
