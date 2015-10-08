package org.unioulu.tol.sqatlab.gameoflife;

public class Grid {
	//GRID X * Y 
	static int gridSize=8;
	
	public static String[][]array = new String [gridSize][gridSize];

public static void setCharacters(){
	for(int i =0; i< array.length; i++){//cols
		for(int k =0; k< array.length; k++){//rows
		 array[i][k]="-";
		 System.out.Println(array[i][k]);
		}	
	}

}
	
	
public static int getArrayLenght(){ 
	// gets the row count of the array
	 int a =	array.length;
	 return a;
	}

public static String getArrayAsList(){ 
 	String a=array.toString();
	 return a;
	}

}

