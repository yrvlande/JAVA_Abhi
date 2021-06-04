package testArray;

public class TestArray{
	static int sum;
	 static int[] testArray = new int[] {1, 4, 6, 2};
     static int[] testArray1 = new int[testArray.length];
     static int[] source = new int[] {1, 4, 6, 2,100};
     
     // Method to copy array array can be passed as formal parameter, can be used as return type
     
    public static int[] testCopy(int[] sourceArray){
    	
    	if (sourceArray == null){
    		
    		return null;
              }
    	else{
    	int[] cpyArray = new int[sourceArray.length]; 
    	System.arraycopy(sourceArray, 0, cpyArray, 0, sourceArray.length);
    	
    	
    	return cpyArray;
    	}
    }
     
     
public static void main(String [] a1){
	

	System.arraycopy(testArray, 0, testArray1, 0, 4);
	for (int a : testArray1 ){
		if (a>0){
		sum = sum + a;
		}
		}
	for (int t : TestArray.testCopy(testArray)){
		System.out.println("Value of " +t);
	}
	System.out.println("You entered " + a1.length
            + " command-line arguments");
if (a1.length > 0) {
System.out.println("They were:");
for (int i = 0; i < a1.length; i++)
System.out.println("   " + a1[i]);
}

	
	
}
	
}
