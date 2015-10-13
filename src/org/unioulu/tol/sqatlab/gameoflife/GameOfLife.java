package org.unioulu.tol.sqatlab.gameoflife;

public class GameOfLife {
	public static void main(String[] args) {
		Grid g = new Grid(3);
		g.getGrid()[0][0].setState("*");
		g.getGrid()[0][1].setState("*");
		g.getGrid()[0][2].setState("*");
		g.getGrid()[1][0].setState("*");
		g.getGrid()[1][1].setState("-");
		g.getGrid()[1][2].setState("*");
		g.getGrid()[2][0].setState("*");
		g.getGrid()[2][1].setState("*");
		g.getGrid()[2][2].setState("*");
		g.display();
		int i = 0, j= 0;
		for(; i< 3;i++)
		{
			for(j = 0; j< 3;j++)
			{
				System.out.print(g.count(i, j));
			}
			System.out.println();
		}
		g.tick();
		g.display();
		//g.tick();
		//g.display();
	}
}
