/* This is Geussing Game Software
1. This is need to use static method and static variable, And No Object Instance.
2. In this Class, User will ask to Provide any number between 1 to 100 and System will match this 
with system generated number.
3. Further User will get 6 chance, If right, User won, Otherwise loosed. 
4. Then if user wants to play again then he can else come out from menu.  
 
*/


package simplePrograms;
public class GuessingGame extends TextIO {
	//Static Variable
 static int gameWon;
 public static void main(String [] args){
	 
TextIO.putln(" *************************Lets Play The Guesssing Game*************************");
boolean playGameAgain;
do{
	playGame();
	TextIO.putln("Would You Like To Play it Again! Then Please type y or n");
	TextIO.putln();
	playGameAgain = TextIO.getlnBoolean();
	}
while(playGameAgain);
TextIO.putln("Number Of Game Won by You " +gameWon);
TextIO.putln("Thank You For Playing Guessing Game!");
 }
     static void playGame(){
         // Generate Random Number between 1 to 100.
    	 int guessingCount;
    	 
    	 TextIO.put("Please, Tell Us Your Name - ");
    	 TextIO.putln();
    	 String Name =  TextIO.getlnString();
    	 
    	 int randomNum = 1 + (int)(Math.random()*100);
    	 TextIO.putln("The Random Number between 1 to 100 is " +randomNum);
    	 TextIO.putln();
    	 for (guessingCount = 1; guessingCount<=6;guessingCount++){
    			 TextIO.putln("Dear " +Name+ " ,Please enter your " +guessingCount+ "st gaussing between 0 to 100");
    			 TextIO.putln();
    			 int UserGuessing = TextIO.getInt();
    			  if(randomNum == UserGuessing){
       			   TextIO.putln("Dear " +Name + " You Won!  Cheers!!!!");
       			   TextIO.putln();
       			   gameWon++;
       			    break;}
    			      
    			      else if(randomNum < UserGuessing){
    				   TextIO.putln("Dear " +Name + " Your Guess is Greater Than System Number");
    			       TextIO.putln();}     		 
    			    	 else if(randomNum > UserGuessing){
    				       TextIO.putln("Dear " +Name + " Your Guess is lesser Than System Number");
    			           TextIO.putln();}     
    			  
    			  }
    	                     if (guessingCount == 7){
			                  TextIO.putln(" Dear " +Name+ " You Lost");}
    	                      TextIO.putln();  
    	  
    		 
    	 }//End of Play Game
      } //End Of Class Guessing Game
	 
 
	
	


