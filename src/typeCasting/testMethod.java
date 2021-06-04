package typeCasting;

public class testMethod {
	
	public static void main(String[] args){
		
		System.out.println("-----Super Class----------");
		SupperClass supVar = new SupperClass();
		supVar.commonMethod();
		supVar.supMethod();
		
		
		System.out.println("-----Sub Class 1----------");
		SubClass1 sub1 = new SubClass1();
		sub1.commonMethod();
		sub1.sub1Method();
		sub1.supMethod();
		
		System.out.println("-----Sup Reference Variable sub class1----------");
		SupperClass supSub1 = new SubClass1();
		supSub1.commonMethod();
		supSub1.supMethod();
		
		
		System.out.println("-----Sup Reference Variable sub class2----------");
		SupperClass supSub2 = new SubClass2();
		supSub2.commonMethod();
		supSub2.supMethod();
		
		
		
		System.out.println("-----Type Casting----------");
		SubClass1 Sub1 = (SubClass1)supSub2;
		Sub1.commonMethod();
		Sub1.sub1Method();
		sub1.supMethod();
		
	}
	

}
