package abstact;
import java.util.*;
public class testAbstract {
	public static int a = 10;
	public static int i = 10;
	public static int j = 10;

	public static void main(String[] args){
	
		
		sungard d = new dev();
		
		sungard q = new qa();
	    sungard i = new it();
		
	    System.out.println(d.a);
	    dev d1 = new dev();
	   
		qa q1 = new qa();
		it i1= new it();
		
		
		
		ArrayList a = new ArrayList(); 	 
		//a.add(d);
		a.add(q);
		a.add(i);
		System.out.println (a);
		for (int x = 0 ; x< a.size(); x++){
			sungard s;
			s = (sungard) a.get(x);
		
			s.procedureForapproval();
		}
		
	}//End of main

}//End of class
