package automobile;

public class Test {
public static void main(String [] args){
	Vehical v1 = new Car();
	System.out.println("Value of registration " + v1.registrationNumber);
	Car c;
	c = (Car)v1;
	
	System.out.println("Value of doors " + c.numberOfDoors);
}//End of Main 
}//End of Test
