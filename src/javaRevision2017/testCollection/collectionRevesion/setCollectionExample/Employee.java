package javaRevision2017.testCollection.collectionRevesion.setCollectionExample;

public class Employee implements Comparable<Object> {
	public String fullName;
	public int id;
	public Employee(String fullName, int id) {
		
		this.fullName=fullName;
		this.id=id;
	}
	
//	@Override
//	public boolean equals(Object emp) {
//		if(this.id==((Employee)emp).id)
//			  return true;
//		
//		else
//			return false;
//	}
//	
//	@Override
//	public int hashCode() {
//	return this.id;
//	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		if(this.id==e.id)
			return 0;
		
		else if(this.id<e.id)
			   return -1;
		
		else
			return 1;
	}

}
