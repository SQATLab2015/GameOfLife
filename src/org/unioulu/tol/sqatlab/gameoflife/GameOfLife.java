package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Scanner;

public class GameOfLife {
	
	private static Boolean running = true;
	private static Grid gameGrid = new Grid(10,10);
	
	public void main () {
		while (running) {
			
			int w,h;
			w=askPositiveInteger("grid width");
			h=askPositiveInteger("grid height");
			
			
			
			running = false;
		}
	}
	
	public int askPositiveInteger (String message) {
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
		
		return num;
	}
	
	public void println(String str) {
		System.out.println(str);
	}
	
	public void print(String str) {
		System.out.print(str);
	}

}
