package org.unioulu.tol.sqatlab.gameoflife;

public class GameOfLife {
	public static void main(String[] args) {
		Grid g = new Grid(2);
		g.getGrid()[0][0].setState("*");
		g.getGrid()[0][1].setState("*");
		g.getGrid()[1][0].setState("-");
		g.getGrid()[1][1].setState("-");
		g.display();
		g.tick();
		g.display();
		g.tick();
		g.display();
	}
}
