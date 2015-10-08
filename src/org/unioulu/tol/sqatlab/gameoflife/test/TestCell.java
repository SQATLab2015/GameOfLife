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

		String[] life = new String[] {"-", "-", "-", "-", "-", "-", "-", "-", "-"};
		int rowLenght = 3;
		String str = Arrays.toString(life);
		str = str.replace(",", "");
		
		System.out.println(str);
		
		
		
	}

}
