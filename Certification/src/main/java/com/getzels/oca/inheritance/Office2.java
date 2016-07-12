package com.getzels.oca.inheritance;

class Employees {
	   String name = "employee";
	   
	   void printName(){
		   System.out.println(name);	   
	   }
	}

class Programmers extends Employees {
String name = "programmer";

 void printName(){
	 System.out.println(name);
 } 
	
}


public class Office2 {
	
	public static void main (String[] args){
		Employees emp = new Employees();
		Employees pro = new Programmers();
		
			
		System.out.println(emp.name);
		System.out.println(pro.name);		
		emp.printName();
		pro.printName();
		
	}
}