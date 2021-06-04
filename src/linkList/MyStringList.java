package linkList;

import java.util.ArrayList;

public class MyStringList {
	
	/**
	 * This is class Implementing the logic of Link List.
	 * This program is not using the provided API of Link 
	 * list to insert, Delete or Search the Element in link 
	 * list. 
	 * 
	 * @author Yashwant.Lande 
	 */
	
	
	/**
	 * Lets define an Inner class to hold String value and Pointer 
	 * to next Block i.e Node.
	 * 
	 */
         
	public class Node{
		
		String stringValue;
		Node nextPointer;
	}
	
	/**
	 * Defined the Instance variable to hold the Head, Starting point 
	 * of Pointer. 
	 * Initially it is Null, When the instance got created of Main class 
	 */
	
	private Node head;
	
	/**
	 * This is API which allows to Insert the value in to Link list,
	 * The incoming string placed on the basic of lexicographically 
	 * hence using the string Comparison and moving the element in 
	 * Link list. 
	 *   
	 */
	
	public void insertString( String inputString){
		
		Node newNode = new Node();
		newNode.stringValue = inputString;
		
		/**
		 * On initializing the the class head is always null, Hence first string always goes to
		 */
		if(head == null){
		 	
			head = newNode;
		}
		
		/**
		 * The String element to put before first one
		 */
		
		else if (head.stringValue.compareTo(inputString)>=0){
			newNode.nextPointer = head;
			head = newNode;
		}
		/**
		 * The string element to put later to first element.
		 */
		
		else {
			/**
			 * Take the previous node and exactly next to previous i.e runner.
			 * Previous it to have reference of object so that it can be replaced with newNode object.
			 * Runner is for to traverse the List
			 */
			Node runner;
			Node previous;
			runner = head.nextPointer;
			previous = head;
			while (runner != null && (runner.stringValue.compareTo(inputString)) <0){
				
				previous = runner;
				runner = runner.nextPointer;
		       }
			   
			    previous.nextPointer = newNode;
			    newNode.nextPointer = runner;	
			}
		 }
	/**
	 * Delete the Element in Link list 
	 */
	              
	  public void deleteElement(String inputString){		  
		  Node runner;
		  Node previous;
		  
		  /**
		   * In case Link List is empty
		   */
		  
		  if (head == null){
			  System.out.println("Link List is Empty");
		  }
		  
		  /**
		   * In case value in the header i.e first occurentce of string matched.
		   */
		  
		  else if (head.stringValue.equals(inputString)){
			 head = head.nextPointer; 
			   }
		  
		  /**
		   * To delete the element later to first element
		   */
		  
		    else {
		      runner = head.nextPointer;
		      previous = head;
		      
			  while (runner != null){
			         if (runner.stringValue.equals(inputString)){
			        	 previous.nextPointer = runner.nextPointer;
			        	 return;
			        	 
			         }
			         else{
			      previous = runner;
				  runner = runner.nextPointer;
				  
			         }
				  }
			  
			    System.out.println("Item Not Found In List");
			  }
		  }
		
	/**
	 * Method to return arraylist of all element in list
	 */
	  
	   public ArrayList listElement(ArrayList inputList){
		   Node runner = head;
		   int count = 0;
		   while(runner!= null)
		   {
			   runner = runner.nextPointer;
			   count++;
		   }
		   runner = head;
		   while(runner!= null){
			   
				   inputList.add(runner.stringValue);
			
			   runner = runner.nextPointer;
		   }
		   return inputList;
	   }
	   	   
	   /**
	    * Find the item in Link list
	    */
	   
	   public boolean findElement(String input){
		  Node runner = head;
		  boolean flag = false; 
		  while (runner != null){
			  if (runner.stringValue.equals(input.toLowerCase())){
				  flag = true;
			  }
			  runner = runner.nextPointer;	  
		  }
		   
		   return flag;
	   }	
}
