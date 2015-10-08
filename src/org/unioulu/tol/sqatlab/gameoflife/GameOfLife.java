package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Scanner;

public class GameOfLife {
	
	private static Boolean running = true;
	private static Grid gameGrid;
	
	public static void main () {
		while (running) {
			
			int w,h;
			w=askPositiveInteger("grid width");
			h=askPositiveInteger("grid height");
			
			gameGrid = new Grid(w,h);
			
			running = false;
		}
	}
	
	public static int askPositiveInteger (String message) {
		int num = -1;
		Scanner scan = new Scanner(System.in);
		do {
			println("Please enter " + message + " (positive integer).");
			print("> ");
			if (scan.hasNextInt()) {
				num = scan.nextInt();
			} else {
				println("Your input was not a positive integer. Try again.");
			}
		} while (num <= 0);
		scan.close();
		return num;
	}
	
	public static void println(String str) {
		System.out.println(str);
	}
	
	public static void print(String str) {
		System.out.print(str);
	}

}
