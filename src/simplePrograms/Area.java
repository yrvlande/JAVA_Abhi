package simplePrograms;

public class Area  {
	/**
	 * Static int variable.
	 * @param args
	 */
	static int testVar; 
	public static void main(String[] args){
		/**
		 * Static int1 variable.
		 * @param args
		 */
		 int testVar1;
		double areaOfRectangle = areaOfRectangle(10.0, 10.0);
		System.out.println("Area of Rectangle is " +areaOfRectangle);
	}
	
	/**
	 * This subroutine computes the area of a rectangle, given its width
	 * and its height.  The length and the width should be positive numbers.
	 * @param width the length of one side of the rectangle
	 * @param height the length the second side of the rectangle
	 * @return the area of the rectangle
	 * @throws IllegalArgumentException if either the width or the height
	 *    is a negative number.
	 */
	public static double areaOfRectangle( double length, double width ) {
	    if ( width < 0  ||  length < 0 )
	       throw new IllegalArgumentException("Sides must have positive length.");
	    double area;
	    area = width * length;
	    
	    
	    return area; 
	  
	}


}
