package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Arrays;

public class TestCell {

	@Test
	public void testLiveCellWithNoNeighborDies() {
	//	Cell cell = new Cell("Alive");
	//	cell.update();
	//	assertEquals.("Dead", cell.getState());

		// Fake 3x3 grid
		String[] gridRow1 = new String[] {"-", "-", "-"};
		String[] gridRow2 = new String[] {"-", "-", "-"};
		String[] gridRow3 = new String[] {"-", "-", "-"};
		String row1ForPrint = Arrays.toString(gridRow1);
		row1ForPrint = row1ForPrint.replace(",", "");
		String row2ForPrint = Arrays.toString(gridRow2);
		row2ForPrint = row2ForPrint.replace(",", "");
		String row3ForPrint = Arrays.toString(gridRow3);
		row3ForPrint = row3ForPrint.replace(",", "");

		System.out.println(row1ForPrint);
		System.out.println(row2ForPrint);
		System.out.println(row3ForPrint);
		
		
		
	}

}
