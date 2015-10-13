package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {
	private Cell[][] grid;
	private int size;
	
	public Cell[][] getGrid() {
		return grid;
	}

	public void setGrid(Cell[][] grid) {
		this.grid = grid;
	}

	public Grid(int n) {
		this.size = n;
		this.grid = new Cell[n][n];
		int i = 0, j = 0;
		for (; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				grid[i][j] = new Cell("");
			}
		}
	}

	public void display() {
		int i = 0, j = 0;
		for (; i < size; i++)
		{
			for (j = 0; j < size; j++)
			{
				System.out.print(grid[i][j].getState());
			}
			System.out.println();
		}
	}

	public int count(int i, int j) {
		int cnt = 0;
		if (i == 0 && j == 0)
		{
			if (grid[0][1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[1][0].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[1][1].getState().equals("*"))
			{
				cnt++;
			}
			return cnt;
		}
		else if (i == 0 && j == size - 1)
		{
			if (grid[0][size - 2].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[1][size - 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[1][size - 2].getState().equals("*"))
			{
				cnt++;
			}
			return cnt;
		}
		else if (i == size - 1 && j == 0)
		{
			if (grid[size - 2][0].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[size - 1][1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[size - 2][1].getState().equals("*"))
			{
				cnt++;
			}
			return cnt;
		}
		else if (i == size - 1 && j == size - 1)
		{
			if (grid[size - 2][size - 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[size - 1][size - 2].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[size - 2][size - 2].getState().equals("*"))
			{
				cnt++;
			}
			return cnt;
		}
		else if (i == 0)
		{
			if (grid[0][j - 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[0][j + 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[1][j - 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[1][j + 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[1][j].getState().equals("*"))
			{
				cnt++;
			}
			return cnt;
		}
		else if (i == size - 1)
		{
			if (grid[size - 1][j - 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[size - 1][j + 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[size - 2][j - 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[size - 2][j + 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[size - 2][j].getState().equals("*"))
			{
				cnt++;
			}
			return cnt;
		}
		else if (j == 0)
		{
			if (grid[i - 1][0].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i - 1][1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i][1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i + 1][0].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i + 1][1].getState().equals("*"))
			{
				cnt++;
			}
			return cnt;
		}
		else if (j == size - 1)
		{
			if (grid[i - 1][size - 2].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i - 1][size - 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i][size - 2].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i + 1][size - 2].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i + 1][size - 1].getState().equals("*"))
			{
				cnt++;
			}
			return cnt;
		}
		else
		{
			if (grid[i - 1][j - 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i - 1][j].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i - 1][j + 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i][j - 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i][j + 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i + 1][j - 1].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i + 1][j].getState().equals("*"))
			{
				cnt++;
			}
			if (grid[i + 1][j + 1].getState().equals("*"))
			{
				cnt++;
			}
			return cnt;
		}
	}

	public void tick() {
		Grid help = new Grid(size);
		int i = 0, j = 0;
		for (; i < size; i++)
		{
			for (j = 0; j < size; j++)
			{
				if (grid[i][j].getState().equals("*"))
				{
					if (count(i, j) == 2 || count(i, j) == 3)
					{
						help.getGrid()[i][j].setState("*");
					}
					else
					{
						help.getGrid()[i][j].setState("-");
					}
				}
				else
				{
					if (count(i, j) == 3)
					{
						help.getGrid()[i][j].setState("*");
					}
					else
					{
						help.getGrid()[i][j].setState("-");
					}
				}
			}
		}
		for (i = 0; i < size; i++)
		{
			for (j = 0; j < size; j++)
			{
				grid[i][j].setState(help.getGrid()[i][j].getState());
			}
		}
	}
}
