package simplePrograms;
/**
 * The Program is meant to find hypotenus of Right Angle triangle with Pythagoras thm.
 * Here actually using the return type for subroutine hence called it as Function. 
 */
public class Pythagoras {
	static double C;
	public static void main(String [] args){
		//lets calculate the hypotenus of Right triangle
		TextIO.putln("Please Enter value of first Side of Right angle triangle");
		double side1 = TextIO.getDouble();
		TextIO.putln("Please Enter value of another Side of Right angle triangle");
		double side2 = TextIO.getDouble();
		double hypotenus = pythagorus(side1, side2); //call the function which calculate the hypotenus fo Right angle triangle. 
		TextIO.putln("The Value of hypotenus " +hypotenus);
		
		}//end of main
	static double pythagorus(double A, double B) // As the returned value is double the return type is used double
	{
		C = Math.sqrt( A*A + B*B ); // calculate the hypotenus

		return C; //Return the calculated value. 
		//TextIO.putln("This statement will get escaped");  This is unreachable code. 
		
	}//end of pythagorus funtion
}//end of Pythagoras class.
