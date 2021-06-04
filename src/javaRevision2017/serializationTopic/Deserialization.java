
package javaRevision2017.serializationTopic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		
		FileInputStream f2 = new FileInputStream("f.text");
		ObjectInputStream o2 = new ObjectInputStream(f2);
		
		Serialization1 ser2 = (Serialization1)o2.readObject();
		System.out.println(ser2.empName + " and " + ser2.empAge);
		
		
	}

}
