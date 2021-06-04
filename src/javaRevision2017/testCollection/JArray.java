package javaRevision2017.testCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class JArray {
            
	       private long id;
	       private String initial;
	       public JArray(long id, String initial){
	    	   this.id=id;
	    	   this.initial=initial;
	       }
	
	public static class Elements{
		private int eleID;
		private String eleName;
		public Elements(int eleID, String eleName){
			this.eleID=eleID;
			this.eleName=eleName;
		}
		
		
		
	}
	public class Elements1{
		private int eleID;
		private String eleName;
		public Elements1(int eleID, String eleName){
			this.eleID=eleID;
			this.eleName=eleName;
		}
	}
	
	public static void main(String args[]){
		
		Elements[] eleA = {new JArray.Elements(1,"A")};
		JArray ja = new JArray(10,"");
		Elements1[] eleB = {ja.new Elements1(1,"B"),ja.new Elements1(1,"C")};
		Elements[] eleC = new JArray.Elements[]{};
		Elements1[] eleD = new JArray.Elements1[5];
		int[] a = new int[]{1};
		a[0]=10;
		Integer[] b = new Integer[5];
		b[0]= 10;
		System.out.println(b[0].byteValue());
		
		char[] chArr = new char[4];
		chArr[0]='y';
		chArr[1]='a';
        chArr[2]='s';
        chArr[3]='h';
		
        try{
        	chArr[4]='l';
        }
        catch(Exception e){
        	e.printStackTrace();
        }
        
        chArr =  Arrays.copyOf(chArr, chArr.length*2);
        
        chArr[4]='l';
        
        String s=new String(chArr);
        
        System.out.println(s);
        
        chArr = Arrays.copyOfRange(chArr, 1, 3);
        s=new String(chArr);
        System.out.println(s);
        
        ArrayList<String> ar1 = new ArrayList<String>();
        
        ar1.add("Yash0");
        ar1.add("yash2");
        ar1.add("Yash3");
        
        ar1.add(1, "yash1");
        ar1.add(4, "yash4");
        ar1.add(0,"yash0");
        
        
        
        
       
        ArrayList<String> ar2 = new ArrayList<String>();
        
        ar2.add("lande0");
        ar2.add("lande1");
        
        ar1.addAll(ar2);
        
        ar1.addAll(1, ar2);
        ar1.set(0,"Yashwant");
        
        ListIterator<String> listIterator = ar1.listIterator();
        while(listIterator.hasPrevious()){
        	System.out.println(listIterator.previous());
        }
        
        
        Iterator<String> itr = ar1.iterator();
        while(itr.hasNext()){
        	//System.out.println(itr.next());
        }
        
		
	}
}
