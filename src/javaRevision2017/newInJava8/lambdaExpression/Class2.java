package javaRevision2017.newInJava8.lambdaExpression;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Class2 {
	
	public static void main(String args[]) {
		
		Interface3 inf3 = new Interface3() {
			public void set(String s) {
				System.out.println(s);
			}
		};
		
		inf3.set("Yash");
		
		
		Interface3 inf33= (s)->{
			System.out.println(s);
		};
		
		inf33.set("AAA");
		
		
		List<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		
	
		
		for(String s:list) {
			
			//System.out.println(s);
		}
	
		ListIterator<String> lstr = list.listIterator();
		
		
		while(lstr.hasNext()) {
			System.out.println(lstr.next());
			
		}
		
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.addAll(list);
		
		linkedList.forEach((n)->{System.out.println("--"+n);});
		
		
		TestInterface intf11 = (val) -> {
			System.out.println(val);
		};
		intf11.setString("AA");
	
	
		
		//Internal implementation of for each
		linkedList.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("-" + t);
				
			}
			
		});
		
		
		linkedList.forEach((x)->{System.out.println(x + " - changed");});
	
	}
	

	
	
	
	

}
