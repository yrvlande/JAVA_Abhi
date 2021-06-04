package javaRevision2017.testCollection;

public class DoubleLinkedList<E> {
          private Node headNode;
          private Node previousNode;
	      private int size;
	
	   private class Node{
		Node previous;
		E data;
		Node next;
		
		public Node(Node previous, E data, Node next){
			this.previous= previous;
			this.data=data;
			this.next=next;
		}
	}
	
	public void add(E data){
	this.addAfter(this.headNode,data );	
		
	}
	
	public void addAfter(Node headNode,E data){
		
		if(this.headNode==null){
			Node head=new Node(null,data,null);
			this.headNode=head;
			this.previousNode=this.headNode;
			this.size=0;			
			}
		
		else{
			Node newNode = new Node(this.previousNode,data,null);
			this.previousNode.next=newNode;
			this.previousNode=newNode;
			this.size++;
			}
	}
	
	public int size(){
		return this.size+1;
	}

	public E get(int index){
		
		if(index >= this.size()){
			throw new IndexOutOfBoundsException();
		}
		Node n= this.headNode;
		for(int i=0;i<=index;i++){
			
			if(i==index){
				return n.data;
			}
			n=n.next;
		}
		return null;
		
	}
	
	public Iterator1 iterator(){
		return new Iterator1(this);
	}
	
	public class Iterator1{
		DoubleLinkedList<E> dll;
		Node n;
       public Iterator1(DoubleLinkedList<E> dll){
    	   this.dll=dll;
    	   n=this.dll.headNode;
       }
   public boolean hasNext(){
		   if(this.n!=null){
			   return true;
		   }
		   else{
			   return false;
		   }
		}
   public E next(){
	   Node n1=this.n;
	   n=n.next;
	   return n1.data;
   }
   
	}
	
	public static void main(String args[]){
		DoubleLinkedList<String> dll= new DoubleLinkedList<String>();
		dll.add("Yashwant");
		dll.add("Mahendra");
		dll.add("Rahul");
		
		System.out.println("Size of Linked List is --> " +dll.size());
		
		DoubleLinkedList.Iterator1 itr = dll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	
}
