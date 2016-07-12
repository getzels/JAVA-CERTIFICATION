package com.getzels.oca.exception;

final class FallInRiverException extends Exception{}

final class DropOarException extends Exception{}


public class RiverRafting {
  public void crossRapid(int degree) throws FallInRiverException {
	  System.out.println("Cross Rapid");
	  
	  if(degree > 10) throw new FallInRiverException();
  }
  
  public void rowRaft(String state) throws DropOarException {
	  System.out.println("Row Rafr");
	   if (state.equals("nervuos")) throw new DropOarException();
  }


public static void main(String[] args){
	RiverRafting a = new RiverRafting();
	
	try{
		a.crossRapid(14);
		a.rowRaft("nervuos");
		System.out.println("Enjoy river rafting");
	}catch(FallInRiverException e1){
		System.out.println("Get back in the raft");
	}catch(DropOarException e2){
		System.out.println("Do not panic");
	}finally{
		System.out.println("Pay for the sport");
	}
	System.out.println("end of then try catch finally block");
	
	
}

}
