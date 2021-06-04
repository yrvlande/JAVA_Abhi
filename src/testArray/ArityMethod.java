package testArray;

import simplePrograms.TextIO;

public class ArityMethod {
 long idValue;
String stdName;
String[] names = new String[5];

 public void testMethod(String... T){
	 for(String a : T){
        //System.out.println(a);
	 }
	 
	 for(int i=0; i<T.length; i++){
		 //System.out.println(T[i]);
		 }
 }
 
  public void assignment(String stdName){
	  //to display the name of candidate
	  idValue++;
	  this.stdName = stdName;
	  System.out.println("Name of Candidate " + stdName + " Having ID " +idValue);
  }
  public void newArray(String[] narray){
        narray = new String[names.length];
  for (String na1: names){
	  System.out.println(na1);
  }
  
  } 
  public static void main(String args[]){
	  
	  ArityMethod aMethod = new ArityMethod();
	  aMethod.testMethod("a","b","c");
	  
	   for(int i=0; i< aMethod.names.length; i++){
		   System.out.println("Enter name");
		   aMethod.names[i] = TextIO.getlnString();
		   aMethod.assignment(aMethod.names[i]);
		   }
	  
	   aMethod.newArray(aMethod.names);
	 }
	
  
}
