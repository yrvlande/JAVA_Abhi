package javaRevision2017.serializationTopic;

import java.io.Serializable;

public class Ser1 implements Serializable {
	
	private String name;
	private int age;
	private transient long sal;
	//private String location;
	private static final long serialVersionUID= 8808508378315273037l;
	
	@Override
	public String toString(){
		
		return "Employee {Name:" +this.name+ ", Age:" +this.age+ ", Salary:" +this.sal+"}";
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	
	public void setSal(long sal){
		this.sal=sal;
	}
	
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	
	public long getSal(){
		return this.sal;
	}
	
//	public void setLocation(String location){
//		this.location=location;
//	}
//	public String getLocation(){
//		return location;
//	}

}
