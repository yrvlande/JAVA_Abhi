package javaRevision2017.interviewProgram;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Conversion {
	
	public static void main (String[] arg) {
		
		Double d = -1.0;
	    Integer i = d.intValue();   
		int i1 = Integer.parseInt(i.toString());
		//System.out.println(i1);
		Object value = "11.2";
		//String value = "11.2";
		   double d1 = Double.parseDouble(value.toString());       
	       int x = Double.valueOf(d1).intValue();
	       System.out.println(x);
	}
	
	
	public void accept (Number n) {
		System.out.println(n);
	}

}
