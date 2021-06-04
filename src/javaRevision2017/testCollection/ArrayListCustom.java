package javaRevision2017.testCollection;

import java.util.Arrays;

public class ArrayListCustom<E> {

	private Object[] elementList;
	private int size=0;
	
	public ArrayListCustom(){
		this.elementList = new Object[10];
	}
	
	public void increaseCapasity(){
		
		int newCap= ((elementList.length*3)/2)+1;
		this.elementList=Arrays.copyOf(elementList, newCap);
		System.out.println(newCap);
	}
	public int size(){
		return this.size;
	}
	
	public boolean add(E element){
		
		if(size > this.elementList.length-1){
			this.increaseCapasity();
			this.elementList[size]=element;
			this.size++;
			return true;
			}
		else{
			this.elementList[size]=element;
			this.size++;
			return true;
		}
	}
	
	public int indexOf(E element){
return 1;		
	}

	public E get(int indx){
		
		return (E)elementList[indx];
		
	}
	
	public static void main(String args[]){
		
		ArrayListCustom<String> s = new ArrayListCustom<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		s.add("F");
		s.add("G");
		s.add("H");
		s.add("I");
		s.add("J");
		s.add("K");
		s.add("L");
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		s.add("F");
		s.add("G");
		s.add("H");
		s.add("I");
		s.add("J");
		s.add("K");
		s.add("L");
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		s.add("F");
		s.add("G");
		s.add("H");
		s.add("I");
		s.add("J");
		s.add("K");
		s.add("L");
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		s.add("F");
		s.add("G");
		s.add("H");
		s.add("I");
		s.add("J");
		s.add("K");
		s.add("L");
	
	System.out.println(s.size());
		for(int i=0;i<s.size();i++){
			//System.out.println(s.get(i));
		}
		
	}
	
	
}
