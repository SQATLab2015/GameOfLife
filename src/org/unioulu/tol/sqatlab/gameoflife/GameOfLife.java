package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Scanner;

public class GameOfLife {
	
	private static Boolean running = true;
	private static Grid gameGrid;
	
	public static void main(String [] args) {
		while (running) {
			
			
			gameGrid = new Grid(50,50);
			
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
