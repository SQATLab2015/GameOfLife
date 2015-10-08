package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class TestCell {

	@Test
	public void testLiveCellWithNoNeighborDies() {
		//Cell cell = new Cell("Alive");
	//	cell.update();
	//	assertEquals.("Dead", cell.getState());
		String life = "-*--------*---------------------------*-------------------------------------------------------------";
		String realLife[] = {"-", "*"};
		Set lifeSet = new HashSet(Arrays.asList(realLife));
		System.out.print(lifeSet);
	}

}
