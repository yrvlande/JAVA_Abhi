/**
 * This class access the TradingIntrest methods and variable to display the Average amount earn by
 * Share holder. 
 */
package simplePrograms;

public class ClientTrading{
	public static void main(String[] args){
		//Create an Object of class TradingIntrest to access its Method and Variable  
		TradingIntrest intrest = new TradingIntrest();
		TextIO.putln("Dear Sir!, Please Enter Your Name");
		intrest.getName(TextIO.getlnString());
		TextIO.putln("Dear Sir!, Kindly Enter the Share Name you invested");
		intrest.getShareName(TextIO.getlnString());
		
		//Call the method to calculate the Average of Returned Client has invested in three attempts of trading
		TextIO.putln("Add a Value you Earn in First Attempt with this share");
		intrest.trade1=TextIO.getlnDouble();
		TextIO.putln("Add a Value you Earn in Second Attempt with this share");
		intrest.trade2=TextIO.getlnDouble();
		TextIO.putln("Add a Value you Earn in Third Attempt with this share");
		intrest.trade3=TextIO.getlnDouble();
		intrest.averageEarn(intrest.trade1,intrest.trade2,intrest.trade3);
		System.out.println("Hello Sir/Madam, The Average Earned by You is " + intrest.totalEarn);
	
		
	}//End of Main
	
}//End of class ClientTrading
