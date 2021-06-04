package javaRevision2017.testCollection.collectionRevesion.setCollectionExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Yashwant Lande1",100);
		Employee emp2 = new Employee("Yashwant Lande2",10);
		Employee emp3 = new Employee("Yashwant Lande3",45);
		Employee emp4 = new Employee("Yashwant Lande4",67);
		
		Set<Employee> s1 = new TreeSet<Employee>();
		s1.add(emp4);
		s1.add(emp3);
		s1.add(emp1);
		s1.add(emp2);
		
		
		Iterator<Employee> itr = s1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next().fullName);
		}
		
		
	
		        
		        
		        
		
				
		
		
	}

}
