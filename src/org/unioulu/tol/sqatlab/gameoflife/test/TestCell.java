package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Arrays;

public class TestCell {

	@Test
	public void testLiveCellWithNoNeighborDies() {
		//Cell cell = new Cell("Alive");
	//	cell.update();
	//	assertEquals.("Dead", cell.getState());
		String realLife[] = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
		String[] life = new String[] {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
		String str = Arrays.toString(life);
		str = str.replace(",", "");
		System.out.println(Arrays.toString(life));
		System.out.println(str);
	}

}
