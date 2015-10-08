package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Scanner;

public class GameOfLife {
	
	private static Boolean running = true;
	private static Grid gameGrid;
	
	public static void main(String [] args) {
		while (running) {
			
			
			gameGrid = new Grid(50,50);
			int w = gameGrid.getWidth();
			int h = gameGrid.getHeight();
			
			//Turns out all cells in the grid are only * (alive) or - (dead)
			//Ran out of time for the excercises, so oh well.
			for (int i = 0; i < w; i++) {
				for (int b = 0; b < h; b++) {
					print(gameGrid.getCellStatus(i,b));
				}
				println("");
			}
			
			running = false;
		}
	}
	
	
	public static void println(String str) {
		System.out.println(str);
	}
	
	public static void print(String str) {
		System.out.print(str);
	}

}
