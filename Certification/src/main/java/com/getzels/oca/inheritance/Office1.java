package com.getzels.oca.inheritance;

public class Office1 {

	
	public static void mains (String[] args){
		Employee emp = new Employee();
		Programmer pro = new Programmer();
		
		System.out.println(emp.name);
		System.out.println(pro.name);		
		emp.printName();
		pro.printName();
		
	}
}
