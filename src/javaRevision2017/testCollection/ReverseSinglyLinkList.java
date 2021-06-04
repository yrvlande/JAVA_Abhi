package javaRevision2017.testCollection;

public class ReverseSinglyLinkList<E> {
	
	Node head;
	Node node;
	int size;
	
	private class Node{
		Node next;
		E data;
		private Node(E data, Node next) {
			this.next=next;
			this.data= data;
			}
		 }
	
	
	public boolean add(E data) {
		
		if(head == null) {
			Node headNode = new Node(data,null);
			this.head = headNode;
			this.node=this.head;
			this.size=0;
			return true;
			}
		else {
			
			Node newNode = new Node(data, null);
			this.node.next=newNode;
			this.node=newNode;
			this.size++;
			return true;
			}
		
	}
	
	public int size() {
		return this.size+1;
	}
	
	public void forwardIterator(){
		
		if(head==null) {
			System.out.println("Its blank");
		}
		
		else {
			Node node= this.head;
			int size= this.size();
			for(int i=0; i<size; i++) {
				System.out.println(node.data);
				node=node.next;
				}
			}
		}
	
	public void reverseIterator() {
		if(head==null) {
			System.out.println("Its blank");
		}
		else {
			int size= this.size();
			
			Node currentNode= this.head;
			Node previousNode=null;
			Node nextNode=null;
			
			
			while(currentNode!=null) {
				nextNode=currentNode.next;
				currentNode.next=previousNode;
				previousNode=currentNode;
				currentNode=nextNode;
				}
			
			Node node = previousNode;
			for(int i=0;i<size;i++) {
				
				System.out.println(node.data);
				node=node.next;
			}
			
			
		}
		
	}
	
	
	public static void main(String arg[]) {
		ReverseSinglyLinkList<String> list = new ReverseSinglyLinkList<String>();
		list.add("FIS");
		list.add("Sungard");
		list.add("Cogni");
		
		System.out.println("Forward Order:---");
		list.forwardIterator();
		
		System.out.println("-----------------------");
		System.out.println("Reverese Order:---");
		list.reverseIterator();
		
		}
	}
