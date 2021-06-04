package javaRevision2017.newInJava8.defaultAndStaticMethods;

public interface Interface1 {
	
	public final String  x="Pune";

	
	public int addNumber(int i, int j);
	
	public default int default1Intf1() {
		static1Intf1();
		return 1;
	}
	
	public static void static1Intf1() {
		
	}
	
	//public void XYZ();

}
