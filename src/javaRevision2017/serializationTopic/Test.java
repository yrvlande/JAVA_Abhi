package javaRevision2017.serializationTopic;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	
	public static void main(String args[]){
		
		Ser1 ser = new Ser1();
		ser.setName("XYZ");
		ser.setAge(10);
		ser.setSal(500);
		
		Ser1 ser1 = new Ser1();
		ser1.setName("PQR");
		ser1.setAge(101);
		ser1.setSal(5001);
		
		
		ArrayList<Ser1> serA =  new ArrayList<Ser1>();
		serA.add(ser);
		serA.add(ser1);
		
		
		try {
			serializationTest.serialize(serA, new File("C:/Users/e1078064/Desktop/serTest.ser"));
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ArrayList<Ser1> list = serializationTest.deSerialize(new File("C:/Users/e1078064/Desktop/serTest.ser"));
			
			for(Ser1 s: list){
				System.out.println(s);
			}
			
		   
			
			
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
