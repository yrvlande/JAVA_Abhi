package linkList;

import java.util.LinkedList;

import java.util.Iterator;

import simplePrograms.TextIO;

public class testEmployeeInformation {

	public static void main(String args []){
		int count = 0;
		EmployeeInformation info; 
		LinkedList<EmployeeInformation> list = new LinkedList<EmployeeInformation>();
		while(count < 2){
			
			info = new EmployeeInformation();
			System.out.println("Please Enter the Employee Name -> ");
			String empName = TextIO.getlnString();
			System.out.println("Please Enter the Employee ID -> ");
			long empID = TextIO.getlnLong();
			info.setInfo(empName, empID);
			list.add(info);
			
			System.out.println("--->" +info.Name);
			System.out.println("--->" +info.ID);
			
			count++;
			}
		
		
		
		for (EmployeeInformation ei : list){
			System.out.println ("Name of Employee " + ei.Name);
			System.out.println ("ID of Employee " + ei.ID);
		}
		
//		Iterator<EmployeeInformation> itr = list.listIterator();
//		System.out.println ("---> " +itr);
//		while(itr.hasNext()){
//			System.out.println ("Name of Employee " +itr.next().Name);
//			System.out.println ("ID of Employee " +itr.next().ID);
//			
//		}
//		

		
	}
	
}
