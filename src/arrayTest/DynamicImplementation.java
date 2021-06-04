package arrayTest;
/**
 * The setting of array element dynamically. This class manages the size of array, The user want to access the 
 * data element which is out of bound would handled with this class.
 * @author Yashwant.Lande
 * @see Collection
 */
public class DynamicImplementation {

   //Define an array with arbitrary size of type Int.
	
	private int[] data;
	
	/**
	 * Initialize the array with constructor.
	 */
	 
	public DynamicImplementation(){
		
		data = new int[2];
	}
	
/**
 * Function to access the value of Array, If the position is out of bound then return the zero.
 */
	
	public int getData(int position){
		
		if (position >= data.length){
			
			return 0;
		}
		else 
			return data[position];
	}
	
	/**
	 * Function to set the value to array element 
	 * If the possition is greater than size of array then increasing the size of Array.
	 */
	
	public void setData(int position, int value){
		
		if (position >= data.length){
			
		int newArraySize = 	data.length * 2;
			
		if (position >= newArraySize){
			newArraySize = position * 2; 
		}
			
		// Define new array to copy the old one
		int [] newArray = new int [newArraySize];
		
		System.arraycopy(data, 0, newArray , 0, data.length);
		data = newArray;
		}
		System.out.println("Size of array " +data.length);
		data[position] = value;
	}
	
}
