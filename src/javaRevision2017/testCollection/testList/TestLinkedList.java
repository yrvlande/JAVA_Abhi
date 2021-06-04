package javaRevision2017.testCollection.testList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
	
	public static void main(String args[]){
		
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("Yash");
		ls.add(0, "Lande");
		System.out.println(ls.size());
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		ArrayList<String> ar = new ArrayList<String>();
		ls.add("Rajura");
		
		String[] s = {"J", "Q" ,"A"};
		
		System.out.println(s);
	    List<String> s1 = Arrays.asList(s);
	    Collections.sort(s1);
	    s = (String[])s1.toArray();
	    for(String s2 :s) {
	    	System.out.println(s2);
	    }
		
		
		
	} 
}
