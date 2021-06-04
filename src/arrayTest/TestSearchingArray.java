package arrayTest;

import simplePrograms.TextIO;

public class TestSearchingArray {

	public static void main (String [] args){
		/**
		 * Declare the array
		 */
		int [] testArray = new int[10];
		/**
		 * Add element to array
		 */
		for(int i=0; i<testArray.length;i++){
			
			testArray[i] = TextIO.getlnInt();
			}
		/**
		 * Find the position of array
		 */
		
		SearchingArray searchArray = new SearchingArray();
		searchArray.sortingArray(testArray, 10);
	}
	
}
