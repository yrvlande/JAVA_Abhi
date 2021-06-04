package javaRevision2017.serializationTopic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization1 implements Serializable {
	public String empName;
	public int empAge;
	public Serialization1(String name, int age){
		this.empName=name;
		this.empAge = age;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		Serialization1 ser1 = new Serialization1("Yash", 30);
		Serialization1 ser2 = new Serialization1("Yash1", 31);
		System.out.println(ser1.empName + " and " + ser1.empAge);
		
		FileOutputStream f1 = new FileOutputStream("f.text");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		o1.writeObject(ser1);
		o1.writeObject(ser2);
		
	}
	
	

}
