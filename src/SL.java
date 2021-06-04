
public class SL {

	
	
	public class Node{
		String val;
		Node nextPointer;
		
	}
	
	public Node head;
	
	public void insertElement(String inputString){
		Node newNode = new Node();
		newNode.val=inputString;
		
		
		
		if(head==null){
			head=newNode;	
		}
		
		else{
			newNode.nextPointer=head;
			head=newNode;
		}
	}
	
	public void getlistValues(){
		Node runner=head;
		while(runner!=null){
			System.out.println(runner.val);
			runner=runner.nextPointer;
		}
	}
	
	
	public static void main(String[] args){
		SL mainClass = new SL();
		mainClass.insertElement("Yashwant");
		mainClass.insertElement("Mahendra");
		mainClass.insertElement("Rahul");
		mainClass.insertElement("Ashish");
		
		mainClass.getlistValues();
		
		
	}
}
