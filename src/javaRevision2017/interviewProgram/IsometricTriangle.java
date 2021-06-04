package javaRevision2017.interviewProgram;

import java.io.IOException;
import java.util.Scanner;

public class IsometricTriangle {

	
	public static void main (String[] args) {
		
		
		for (int row=1;row<=5; row++) {
			for (int col=1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter length of Equilateral Triangle");   
		//int sideLength = scanner.nextInt();
		try {
			System.in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int sideLength = 10;
		System.out.println(sideLength);
		//scanner.close();
		int placeToPutFirstStar = 10;
	    //int placeToPutFirstStar = (sideLength%2)>0 ? sideLength/2+1 : sideLength/2  ;
	    //System.out.println(placeToPutFirstStar);
	    boolean flag = true;
	    int arg = 1;
	    for (int row = 1 ; row <= sideLength ; row++ ) {
	       
	       if (row != 1) {
	    	   arg = arg+2;
	    	   }
	    	for ( int col = 1 ; col <= arg ; col++ ) {
	    		
	    		if(flag) {
	    		
	    			for ( int init = 1 ; init <= placeToPutFirstStar ; init++ ) {
	    			System.out.print(" ");
	    		}
	    	   }
	    		
	    		System.out.print("*");
	    		flag = false;
	    	}
	    	System.out.println();
	    	--placeToPutFirstStar;
	    	flag =true;
	    	
	    }
	    
	    
		
	} 

   
   
  


}
