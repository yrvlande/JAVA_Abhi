package recursion;

public class BinarySearch {
	
	
	/**
	 * Instance Method for Incrementing supplied array.
	 * @param testArray
	 */
	 public int[] increamentOrderOfArray(int[] testArray  ){
		 int c =0;
		 while(c < (testArray.length))
		 { 
			 for (int j=c ; j<testArray.length; j++)
	      if(testArray[c] > testArray[j]){
	    	  int x ;
	    	  x= testArray[c];
	    	  testArray[c] = testArray[j];
	    	  testArray[j] = x;
	      }
			 c++;
		 }
		 return testArray;
		 }
	 
	 /**
	  * Binary Search of element in Array using recursion.
	  * @param searchArray
	  * @param loIndex
	  * @param hiIndex
	  * @param val
	  * PreCodition: The array must be in increase order state.
	  * TODO : Not Yet Done 
	  */
	 
	 public void binarySearchWithRecursion(int[] searchArray, int loIndex, int hiIndex, int val){
		}
	 
	 
	 /**
	  * Simple search of the Array : Element by Element 
	  * @param searchArray1
	  * @param val
	  */
	 public void simpleElementSearch(int[] searchArray1, int val){
		 boolean flag = true;
		 
		 for (int i=0; i<searchArray1.length;i++){
			 
			 if (val == searchArray1[i]){
				 
				 System.out.println("The value is Found at Possition " +(i-1));
				 flag = false;
				}
	         
			}
		 if (flag){
			 System.out.println("Not Found");
		 }
		
		 }
	 
		public static void main (String [] args){
			
			int [] userArray = {10,19,98,98,90};
			
			BinarySearch bs = new BinarySearch();
			int[] increamentedArray= bs.increamentOrderOfArray(userArray);
//			for (int i=0; i<increamentedArray.length; i++){
//				System.out.println(userArray[i]);
//				}
			
			bs.simpleElementSearch(increamentedArray, 98);
				
			}
			
			
			
			
		}
		
		

	
	

