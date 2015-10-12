package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;
import org.unioulu.tol.sqatlab.gameoflife.GameOfLife;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class GameOfLifeTest {

	
	

	@Test
	public void testPrintLife() {
		GameOfLife game = new GameOfLife();
		Grid grid = new Grid();
		Cell cell1 = new Cell("Alive",0,0);
		Cell cell2 = new Cell("Dead",1,0);
		Cell cell3 = new Cell("Alive",0,1);
		Cell cell4 = new Cell("Dead",1,1);
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		grid.addCell(cell3);
		grid.addCell(cell4);
		
		String gridLife = "*-\n*-"; 
		System.out.println(gridLife);
		System.out.println(game.printLife(grid));
		assertEquals(gridLife, game.printLife(grid));
	}

}
