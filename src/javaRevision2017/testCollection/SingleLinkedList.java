package javaRevision2017.testCollection;

public class SingleLinkedList<E> {
	     private Node head = null; 
	     private Node previous=null;
	     private int size;
	private class Node{
		E data;
		Node next;
		
		public Node(E data,Node next){
			this.data=data;
			this.next=next;
		}
		
		
	}
	
	
	public boolean add(E data){
		addLast(this.head, data);
		
		return true;
	}
	
	private void addLast(Node head,E data){
          if(head==null){
        	  this.head= new Node(data,null);
        	  this.previous=this.head;
        	  this.size=0;
          } 
          
           else{
        	  Node newNode=new Node(data,null);
        	  this.previous.next=newNode;
        	  this.previous=newNode;
        	  size++;
          }
	}
	
	public void setSize(){
		
	}
	public int size(){
		return this.size+1;
	}
	
	
	public E get(int index){
		if(index > this.size){
			throw new IndexOutOfBoundsException("index is bigger than linked list size");
			
		}
		Node n = this.head;
		for(int i=0 ;i<=index;i++){
			
			if(i==index){
				return n.data;
			}
			n=n.next;
		}
		return null;
		
		
		
	}
	
	
	public static void main(String args[]){
		
		SingleLinkedList<String> s = new SingleLinkedList<String>();
		s.add("Yashwant");
		s.add("Mahi");
		s.add("Rahul");
		System.out.println(s.size());
		
		System.out.println(s.get(2));
	}
}
