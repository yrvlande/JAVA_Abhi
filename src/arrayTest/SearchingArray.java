package arrayTest;

public class SearchingArray {
public  boolean flag = true;
	/**
	 * Sorting Method
	 * @param inputArray
	 * @param N
	 */
	public  void sortingArray(int [] inputArray, int N){
		 
		for(int index = 0 ; index <inputArray.length; index++ ){
			if (inputArray[index] == N){
				flag = false;
				System.out.println("Value of Index " + index);
				}
			    }
		
		if (flag){
			System.out.println("Sorry , Not Found!!!");
		}
		
	}
	
}
