package simplePrograms;
/*
 The Programe is basically find 3N+1 Sequence, This Required to provide the initial number.
 Further If the number is ODD the "if N is odd, multiply it by 3 and add 1; if N is even, divide it by 2; continue until N is equal to 1." 
 For example, starting from N=3 we get the sequence: 3, 10, 5, 16, 8, 4, 2, 1.)
 */
public class threeNSequence {
	static int numberEntered;
public static void main(String[] args){
	 TextIO.putln("Please Enter the Number");
	 numberEntered = TextIO.getInt();
	 calculateSequence(numberEntered);
     	}
static void calculateSequence(int userEntry){
	  //lets calculate the Sequence
	 if(userEntry<= 0){
		 throw new IllegalArgumentException("The Number is not positive");
		 
	 }
	  int arraylengh = 0;
	  TextIO.putln("The Number is " +numberEntered);
	  
	  TextIO.putln("Lets find 3N+1 Sequence for User Entered number");
	  TextIO.putln(numberEntered);
	  do{
	  if (numberEntered%2==0){
		  numberEntered = numberEntered/2; 
		 }
	  else{
		  numberEntered =(numberEntered*3)+1;
		  }
	  System.out.println(numberEntered);
	  }while(numberEntered !=1);
	 }
  



}
