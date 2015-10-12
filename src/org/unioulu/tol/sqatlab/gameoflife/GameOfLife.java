package org.unioulu.tol.sqatlab.gameoflife;

public class GameOfLife {
	
	public GameOfLife(){
		
	}

	public String printLife(Grid grid) {
		String life = "";
		for(int j = 0; j <  Math.sqrt(grid.cells.size()); j++){
			for(int i = 0; i < Math.sqrt(grid.cells.size()); i++){
				Cell aliveCell = new Cell("Alive", i, j);
				if (grid.cells.contains(aliveCell)) 
					life = life + "*";
				else life = life + "-";
			}
			if (j<Math.sqrt(grid.cells.size())-1) life = life + "\n";
		}
		
		//System.out.print(life);
		return life;
	}

	
}
