package arrayTest;

import simplePrograms.TextIO;

//The class is meant to add the number to array having size less than 100 and element should not be the 
//less than or equal to zero.
public class PartiallyFullArray{
	int[] arrayNumber = new int[5];
	public void arrayCalculation(){
	
	int num;
	int numIndex = 0;
	while(true){
		System.out.println("Please enter the num");
		num = TextIO.getlnInt();
		if (num <= 0 || arrayNumber.length <= numIndex){
			System.out.println("The Entered value is either 0 or Smaller than 0 Or index exceeded");
			break;
		}
		arrayNumber[numIndex]= num;
		numIndex++;
	}
	/**
	 * The number printing
	 */
	for (int t: arrayNumber ){
		System.out.println(t);
	}
	}
	/**
	 * The array element reverese in order
	 */
	public void reverseOrder(){
		
     for(int i = arrayNumber.length-1; i >= 0; i--){
    	 
    	 System.out.println(arrayNumber[i]); 
    	 
     }
	for ( int j =0 ; j< arrayNumber.length; j++){
		
		//System.out.println(arrayNumber[j]);
	}	
		
	}
		
		
	
	
	public static void main (String[] args){
		
		
		PartiallyFullArray ref1 = new PartiallyFullArray();
		ref1.arrayCalculation();
		System.out.println("Reverse Order of Array");
		ref1.reverseOrder();
	}
	
	
	
}
