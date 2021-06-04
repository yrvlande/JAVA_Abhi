package javaRevision2017.testCollection.collectionRevesion.setCollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SetHashExample {
	
	
	public static void main(String args[]) {
		
	   Set<String> set1 = new HashSet<String>();
	   Set<String> set2 = new HashSet<String>();
	  
	   set1.add("Yash");
	   set1.add("Sonu");
	   set1.add("Vashishtha");
	   set1.add("ABC");
	  // set1.add(null);
	   
	   for(String s : set1) {
		   System.out.println(s);
	   }
	   ArrayList<String> nL = new ArrayList<>();
	   set1.stream().forEach(new Consumer<String>() {
		   public void accept(String s) {
			  nL.add(s+"T");
		   }
		  });
	   
	   Set<String> set5 = set1.stream().sorted().collect(Collectors.toSet());
	   
	   System.out.println("^^^^^^^^^" + set5);
	   
	   set1.stream().forEach(val -> nL.add(val+"P"));
	   System.out.println(nL);
	   
	   for(String s : set1) {
		   System.out.println(s);
	   }
	   
	   System.out.println(set1);
	   
	   Iterator<String> itr = set1.iterator();
	    
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	   
	   set2.add("Swapnil");
	   set2.add("Swarit");
	   set2.add("Sonu");
	   
	   set1.remove("ABC");
	   
	   System.out.println(set1);
	   
	   set1.addAll(set2);
	   System.out.println(set1);
	   System.out.println(set1.containsAll(set2));
	   
	   set1.retainAll(set2);
	   System.out.println(set1);
	   
	   
	   List<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		
		
		set1.addAll(list);
		
		System.out.println(set1);
	   
	   
		Set<String> set3 = new HashSet<String> ();
		set3.add("Yash");
		set3.add("Lande");
		set3.addAll(list);
		set3.remove("Yash");
		System.out.println(set3);
		set3.removeAll(list);
		System.out.println(set3);
		set3.addAll(list);
		set3.retainAll(list);
		System.out.println(set3);
		
	   for (String s : set3) {
		   System.out.println(s);
	   }
	   
	   Iterator<String> itr111 = set3.iterator();
	   
	   while (itr111.hasNext()) {
		   System.out.println(itr111.next());
	   }
	   set3.add("Yash");
		set3.add("Lande");
		
		System.out.println(set3);
	   List<String> ls1 = new ArrayList<String>();
	   ls1.add("BBB"); ls1.add("Lande");
	   
	   System.out.println(set3.containsAll(ls1));
	   
	   List<String> LLL = set1.stream().filter(new Predicate<String> () {

		@Override
		public boolean test(String t) {
			// TODO Auto-generated method stub
			return t.equals("AAA");
		}
		   
	   }).collect(Collectors.toList());
	   
	   System.out.println(LLL);
	  set3.removeIf(e -> e.equals("BBB"));
	    System.out.println(set3);
	
	
	}
	
  	
	

}
