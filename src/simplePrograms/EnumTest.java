package simplePrograms;

public class EnumTest {
	enum weekDay {Monday, Tuesday, Wednesday, Thursday, Friday, Saterday, Sunday};
public static void main(String[] args){
	enumTest();
		
}
public static void enumTest(){
	
	weekDay day = weekDay.Monday ;
      int A = day.ordinal();
      int B = weekDay.Friday.ordinal();
      System.out.println("Ordinal "+ A);
	System.out.println("Day "+ day);
	for (weekDay d : weekDay.values()) {
		
		System.out.println(d);
		
		System.out.println(d.ordinal());
		
	}

}
}
