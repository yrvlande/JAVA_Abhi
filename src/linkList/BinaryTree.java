package linkList;

/**
 * Class is to implement the Binary Tree for the String comparing it and adding it the tree. 
 * @author Yashwant.Lande
 *
 */

public class BinaryTree {
	
	/**
	 * Subclass to hold the String and Two Pointers.
	 */
	
	public class Node{
		Node rightNode;
		Node leftNode;
		String inputString;
	}
	
	public Node rootNode;
	
	public void addString(String inputValue){
		Node newNode = new Node();
		newNode.inputString = inputValue;
		
		if (rootNode == null ){
			
			rootNode = newNode;
			}
		//to add element in left subtree
		else {
			Node runner;
			runner = rootNode;
			 if((runner != null) && (rootNode.inputString.compareTo(inputValue)>0)){
			     runner = runner.leftNode;	 
			 }
			 
	}
	
	
	}
	
}
