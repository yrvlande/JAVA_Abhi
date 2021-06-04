package exceptionTest.exceptionRevision17;

//Note: This class will not compile yet.
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {

 private List<Integer> list;
 private static final int SIZE = 10;
int a;



 
 public ListOfNumbers () {
     list = new ArrayList<Integer>(SIZE);
     for (int i = 0; i < SIZE; i++) {
    	// System.out.println(i);
         list.add(new Integer(i));
     }
 }

 public void writeList() {
	 
	 try{
	// The FileWriter constructor throws IOException, which must be caught.
     PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

     for (int i = 0; i <= SIZE; i++) {
         // The get(int) method throws IndexOutOfBoundsException, which must be caught.
         out.println("Value at: " + i + " = " + list.get(i));
     }
     out.close();
	 }
	 catch(IOException io){
		System.out.println(io.getMessage());
	 }
	 catch(RuntimeException idx){
		 idx=new IndexOutOfBoundsException();
		 //idx.printStackTrace();
	 }
 }
 
 public static void main(String[] args) throws IOException{
	 ListOfNumbers l = new ListOfNumbers();
	 l.writeList();
	 System.out.println("------");	 
 }
}
