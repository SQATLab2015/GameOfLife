package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCell {

	@Test
	public void testLiveCellWithNoNeighborDies() {
		Cell cell = new Cell("Alive");
		cell.update(0);
		assertEquals.("Dead", cell.getState());
	}

}
