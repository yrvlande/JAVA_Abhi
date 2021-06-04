package automobile;

public class Car extends Vehical{
	int numberOfDoors =10;
	
public static void main (String [] args){
	Vehical myVehicle = new Car();
	System.out.println(myVehicle);
	System.out.println("Vehical Data");
	if (myVehicle instanceof Car){
	System.out.println("Registration Number " +myVehicle.registrationNumber );
	Car c;

	   c = (Car)myVehicle;  // Type-cast to get access to numberOfDoors!
	   System.out.println(c);
	   
	   System.out.println("Number of doors:  " + c.numberOfDoors);

	}
	
	
}//End of main


}//End Of Class Car