package simplePrograms;

public class StudyWrapperClasses {
	int A = 10;
	public StudyWrapperClasses(int G){
		System.out.println("Constructor gets called here");
	}
	public static void main(String [] args){
		int i = 11;
		Integer B = new Integer(10);
		Double C  = new Double(10.5);
		StudyWrapperClasses d = new StudyWrapperClasses(9);
         
          


System.out.println(B);
System.out.println(C);
System.out.println(d);
	}
	
     
}//End of StudyWrapperClasses
