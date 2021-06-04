package javaRevision2017.exceptions;

//Note: This class will not compile yet.
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {

 private List<Integer> list;
 private static final int SIZE = 10;

 public ListOfNumbers () {
     list = new ArrayList<Integer>(SIZE);
     for (int i = 0; i < SIZE; i++) {
         list.add(new Integer(i));
     }
 }

 public void writeList() {
	// The FileWriter constructor throws IOException, which must be caught.
     PrintWriter out=null;
	try {
		out = new PrintWriter(new FileWriter("OutFile.txt"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	finally {
		out.close();
	}

     for (int i = 0; i < SIZE; i++) {
         // The get(int) method throws IndexOutOfBoundsException, which must be caught.
         out.println("Value at: " + i + " = " + list.get(i));
     }

 }
 
 public static void main(String args[]) {
	 
	 new ListOfNumbers().writeList();
 }
}
