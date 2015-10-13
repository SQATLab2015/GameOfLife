package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.GameOfLife;

public class TestGameOfLife {
	GameOfLife gameOfLife;
	
	@Test
	public void testSetupGameNineCells_ReturnNine() {
		gameOfLife = new GameOfLife(3);
		gameOfLife.setupGame();
		int numberOfCells = gameOfLife.grid.cells.size();
		
		assertEquals(9, numberOfCells);
	}
	
	@Test
	public void testSetupGameOneCell_ReturnOne() {
		gameOfLife = new GameOfLife(1);
		gameOfLife.setupGame(createRandomStates(gameOfLife.numberOfCells));
		int numberOfCells = gameOfLife.grid.cells.size();
		
		assertEquals(1, numberOfCells);
	}
	
	@Test
	public void testCreateRandomStates(){
		gameOfLife = new GameOfLife(2);
		String[] states = gameOfLife.createRandomStates(gameOfLife.getNumberOfCells());
		
		assertEquals(4, states.length);
		assertEquals(true, states[0].matches("Dead|Alive"));
		assertEquals(true, states[1].matches("Dead|Alive"));
		assertEquals(true, states[2].matches("Dead|Alive"));
		assertEquals(true, states[3].matches("Dead|Alive"));
	}
	
	//validateGame
	
	//nextRound
	
	
	
//	@Test
//	public void testPrintGame(){
//		gameOfLife
//	}
}
