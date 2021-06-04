package linkList;

import java.util.ArrayList;

import simplePrograms.TextIO;

public class testStack {
 public static void main (String args []){
	 
	 MyStack testStack = new MyStack();
	 
	 int maxSize = 10;
	 int count = 0;
	 
	 while (maxSize != count){
		 
		 System.out.println("Please see the Below Option for Link list operation");
		 System.out.println("=================================");
		 System.out.println("1 : Add element");
		 System.out.println("2 : Display all Element");
		 System.out.println("3 : Delete first Element");
		 System.out.println("=================================");
		 int userOption = TextIO.getlnInt();
		 switch(userOption){
		 case 1: {
			 int userInput = TextIO.getlnInt(); 
			 testStack.push(userInput);
			 break;
		 }
		 case 2: {
			 ArrayList intList = new ArrayList();
			 testStack.listOfElement(intList);
			 
			 for (int i=0 ; i<intList.size();i++)
			 {
				 System.out.println(intList.get(i));
			 }
			 break;
		 }
		 case 3: {
			 
			 System.out.println ("Deleted int --->  " +testStack.pop1());
			 break;
		 }
		 default:
		  System.out.println("Please enter values from list to make operation");
		 }
		 
		 
		 count++;
	 }
	 
 }
	
	
}
