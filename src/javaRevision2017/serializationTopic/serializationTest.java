package javaRevision2017.serializationTopic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class serializationTest {
	
	public static void serialize(ArrayList<Ser1> SerList, File f) throws IOException {
		
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
          
		oos.writeObject(SerList);
		
		fos.close();
		oos.close();
		 }
	
	public static ArrayList<Ser1> deSerialize(File f) throws IOException, ClassCastException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Ser1> retAl = (ArrayList<Ser1>)ois.readObject();
		ois.close();
		return retAl;
	    
		
	}

}
