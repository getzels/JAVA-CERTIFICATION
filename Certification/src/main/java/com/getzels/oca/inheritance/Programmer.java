package com.getzels.oca.inheritance;

public class Programmer extends Employee implements MovileAppExpert {
String name = "programmer";

 void printName(){
	 System.out.println(name);
 } 
 
 public void deliverMobileApp(){
	 System.out.println("testing complete on real device");
 }
	
}
