package linkList;

import java.util.ArrayList;
import java.util.LinkedList;

import simplePrograms.TextIO;

public class TestStringList {

	public static void main(String args[]){
		
		MyStringList list = new MyStringList();
		int numberOfItem = 10;
		int count =0;
		while (numberOfItem != count)
		{
        System.out.println(" Select the Below Option : "); 		
        System.out.println(" 1 : Add Elelent : ");
        System.out.println(" 2 : Delete Elelent : ");
        System.out.println(" 3 : List Elelent : ");
        System.out.println(" 4 : Find Elelent : ");
        System.out.println(" PROGRAM STARTS");
        int operationInt = TextIO.getlnInt();
        
        switch(operationInt){
        case 1: {
        String inputString = TextIO.getlnString().toLowerCase();
        list.insertString(inputString);
        break;
        }
        case 2:{
        	String userValue = TextIO.getlnString();
        	list.deleteElement(userValue);
        	break;
        }
        case 3: {
        	ArrayList<MyStringList> stringList = new ArrayList<MyStringList>();
        	ArrayList outputList = list.listElement(stringList);
        	for (int i =0 ; i<outputList.size(); i++){
        		
        		System.out.println(outputList.get(i));
        	}

        	break;
        }
        case 4: {
        	
        	String userValue = TextIO.getlnString();
        	boolean isAvailable = list.findElement(userValue);
        	
            if (isAvailable){
            	System.out.println (" -- The value is Available in List, Search result is True ");
            }
            else {
            	System.out.println (" -- NO, Search result is False ");
            }
            	
        	
        }
        }
        count++;
	}
	
	
}
}