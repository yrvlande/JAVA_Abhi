package javaRevision2017.testCollection.collectionRevesion.setCollectionExample;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Yashwant Lande1",1);
		Employee emp2 = new Employee("Yashwant Lande2",2);
		Employee emp3 = new Employee("Yashwant Lande3",1);
		
		Set<Employee> s1 =  new LinkedHashSet<Employee>();
		s1.add(emp3);
		s1.add(emp1);
		s1.add(emp2);
		
		System.out.println(s1.size());
		System.out.println(s1);
	}

}
