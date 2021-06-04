package javaRevision2017.testCollection;

public class Student implements Comparable<Student>{
	private long ID;
	private String name;
	public Student(long ID, String name){
		this.ID=ID;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object student){
		
		if(student==null)
			return false;
		
		else if(this==(Student)student){
			return true;
		}
		else{
			
			if(this.ID==((Student)student).ID && this.name.equals(((Student)student).name)){
				return true;
			}
			else {
				return false;
			}
		}
			
	}
	
	public long getID(){
		return this.ID;
	}
	
	@Override
	public int hashCode(){
		return (int)this.ID/2;
		
	}

	@Override
	public int compareTo(Student o) {
		if(this.ID>o.ID)
			return 1;
		
		else if(this.ID<o.ID)
			return -1;
		
		else 
			return 0;
	}

}
