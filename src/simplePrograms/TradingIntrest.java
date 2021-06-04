/**
 * Base Class is for Share holder Earning with purchased share.
 * This class will expose the method to add the Client and share he has hold, 
 * And the average calculation in Three attempt 
 */
package simplePrograms;

public class TradingIntrest{
	private String clientName; //Name of Share holder
	private String shareName;  //Name of Share
	double trade1,trade2,trade3, totalEarn; //Amount the share holder Earned
	//The name is Private so Getter Method required here 
	public String getName(String shareHolderName){
		clientName = shareHolderName;
		return clientName;
		}//End Of getter method of name
	public String getShareName(String investedShareName){
		shareName = investedShareName;
		return shareName;
	}//End of getShareName
	//Calculate the The Average Earn by Share Holder with purchased share. 
	public double averageEarn(double a, double b, double c){
		totalEarn = (trade1 + trade2 + trade3)/3;
		return totalEarn;
	 }//End of averageEarn routine   
	
}//End of class TradingIntrest
