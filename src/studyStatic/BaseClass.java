package studyStatic;
/**
 * Static Verification
 * @author Yashwant.Lande
 *
 */
public class BaseClass {
     public static int i;// Static variable
     public int j; //non static variable
     /*
      * Constructor to initialize the object having formal parameter
      */
     public BaseClass (int i1, int j1){
    	 i = i1;
    	 j = j1;
    	 i++;
    	 j++;
     }// End of Constructor
     
     public BaseClass (){
    	 i++;
    	 j++;
    	 }
     
     public static int addInt(int x, int y){
    	 i = x;
    	 int k = i;
    	 
    	 return k;
    	 
     } // End of Static method
	public int multiplyInt (int p,int q){
		i = p;
		j = q;
		
		int l = (p*q);
		return l;
	}// End of Non Static Method
	
	public static void substract(){
		
	}
}
