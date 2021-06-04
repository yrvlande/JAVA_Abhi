package linkList;

import java.util.ArrayList;

public class MyStack {

/**
 * This class have link list of integer, and Add and delete operation. 	
 */
	
	  /**
	   * Sub class to hold value of int and Pointer.
	   */
	
	  private class Node {
		  
		  Node nextPointer;
		  int inputInt;
	  }
	  
	  /**
	   * Accessible point for link list which is instance variable of MyStack
	   */
	  
	  public Node head;
	  
	  
	  /**
	   * To add the integer in to list
	   */
	  
	  public void push (int userInt){
		  
		  Node newNode = new Node();
		  newNode.inputInt = userInt;
		  
		  if (head == null){
			  newNode.nextPointer= head;
			  head = newNode;
		  }
			  else {
				  newNode.nextPointer = head;
				  head = newNode;
			  }	  
		  }
	  
	  /**
	   * Delete the first element in the stack
	   */
	  
	  public void pop (int userValue){
		  
		  if (head == null){
			  
			  System.out.println("Stack is Empty");
		  }
		  
		  else if (head.inputInt != userValue){
			  System.out.println("Input value is not first value in stack");
		  }
		  
		  else if (head.inputInt == userValue){
			  Node dummy;
			  dummy = head.nextPointer;
			  head = dummy;
		    }
		  else{
			  System.out.println("Given input value is not available at first level of Stack");
		  }
	  }
	  
	  
	  public int pop1(){
		  int lastInt;
            if (head == null){
			  System.out.println("Stack is Empty");
			  return -1;
		      }
            else {
            	Node dummy;
            	lastInt = head.inputInt;
            	dummy = head.nextPointer;
            	head = dummy;
            	return lastInt;
            }
            
		  
		  
	  }
	  
	  
	  
	/**
	 * Display the link list  
	 * @param inputList
	 * @return
	 */
	  public ArrayList listOfElement (ArrayList inputList){
		  Node runner;
		  runner = head;
		  int count = 0;
		  while (runner != null){
			  
			  runner = runner.nextPointer;
			  count++;
		  }
		  
		  runner = head;
		  while (runner != null){
			  inputList.add(runner.inputInt);
			  runner = runner.nextPointer;
		  }
		  
		  return inputList;
	  }
		  
	  }
	  



